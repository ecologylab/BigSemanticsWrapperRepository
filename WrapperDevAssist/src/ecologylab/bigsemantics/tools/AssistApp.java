package ecologylab.bigsemantics.tools;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import org.apache.commons.configuration.ConfigurationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ecologylab.bigsemantics.tools.Forker.Result;

public class AssistApp extends WindowAdapter
{

  static Logger logger = LoggerFactory.getLogger(AssistApp.class);

  JButton       btnUpdate;

  JTextArea     textArea;

  JFrame        frame;

  Forker        forker;

  BSService     service;

  public AssistApp()
  {
    forker = new Forker();
    try
    {
      service = new BSService();
    }
    catch (ConfigurationException e)
    {
      error("Error starting up the BS service.", null, e);
      return;
    }

    createGUI();
    display();
    msg("Initializing...");

    if (!checkEnv())
    {
      error("Failed to start up! Please check your environment.", null, null);
      return;
    }

    btnUpdate.setEnabled(true);
    msg("Ready.");
  }

  public void createGUI()
  {
    JPanel contentPanel = new JPanel(new GridBagLayout());
    contentPanel.setOpaque(true);

    btnUpdate = new JButton("Update Backend with New Wrappers");
    btnUpdate.setEnabled(false);
    btnUpdate.setVerticalTextPosition(AbstractButton.CENTER);
    btnUpdate.setHorizontalTextPosition(AbstractButton.CENTER);
    btnUpdate.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent event)
      {
        btnUpdate.setEnabled(false);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable()
        {
          @Override
          public void run()
          {
            updateBackend();
            SwingUtilities.invokeLater(new Runnable()
            {
              @Override
              public void run()
              {
                btnUpdate.setEnabled(true);
              }
            });
          }
        });
        executor.shutdown();
      }
    });

    GridBagConstraints c =
        new GridBagConstraints(0, // gridx
                               0, // gridy
                               1, // gridwidth
                               1, // gridheight
                               0, // weightx
                               0, // weighty
                               GridBagConstraints.CENTER, // anchor
                               GridBagConstraints.NONE, // fill
                               new Insets(8, 8, 8, 8), // insets
                               8, // ipadx
                               8); // ipady
    contentPanel.add(btnUpdate, c);

    textArea = new JTextArea(40, 100);
    textArea.setEditable(false);
    textArea.setBorder(BorderFactory.createLoweredBevelBorder());
    textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 10));
    JScrollPane scroll = new JScrollPane(textArea);
    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    c.gridx = 0;
    c.gridy = 1;
    c.weightx = 1;
    c.weighty = 1;
    c.fill = GridBagConstraints.BOTH;
    contentPanel.add(scroll, c);

    frame = new JFrame("BS Wrapper Dev Assist");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.addWindowListener(new WindowAdapter()
    {
      @Override
      public void windowClosing(WindowEvent event)
      {
        msg("Window is closing, cleaning up ...");
        try
        {
          stopService();
        }
        catch (Exception e)
        {
          error("Error stopping BS service.", null, e);
        }
      }

    });
    frame.setContentPane(contentPanel);
  }

  public void display()
  {
    javax.swing.SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        frame.pack();
        frame.setVisible(true);
      }
    });
  }

  private void msgHelper(String msg)
  {
    logger.info(msg);
    textArea.append(msg + "\n");
    textArea.setCaretPosition(textArea.getDocument().getLength());
  }

  private void msg(String msg)
  {
    msgHelper(msg);
    SwingUtilities.invokeLater(new Runnable()
    {
      @Override
      public void run()
      {
        frame.invalidate();
      }
    });
  }

  private void error(String msg, String info, Throwable t)
  {
    if (t != null)
    {
      logger.error(msg, t);
    }
    if (info != null)
    {
      String[] lines = info.split("\n");
      for (String line : lines)
      {
        msgHelper("    >> " + line);
      }
    }
    msg("ERROR: " + msg);
  }

  private boolean checkEnv()
  {
    return forkAndCheck(500, "Error detecting Apache Ant which is needed.", "ant", "-version")
        && forkAndCheck(500, "Error detecting Apache Maven which is needed.", "mvn", "-version")
        && forkAndCheck(15000,
                        "Error building required WAR and JAR from DownloaderPool.",
                        "ant",
                        "build-dpool")
        && fileExists("../../BigSemanticsJavaScript",
                      "Error locating project BigSemanticsJavaScript.");
  }

  private boolean forkAndCheck(long timeout, String errMsg, String... cmds)
  {
    Result result = forker.fork(timeout, cmds);
    if (result.returnCode != 0)
    {
      error(errMsg, result.err, null);
      return false;
    }
    return true;
  }

  private boolean fileExists(String path, String errMsg)
  {
    File f = new File(path);
    if (!f.exists())
    {
      error(errMsg, null, null);
      return false;
    }
    return true;
  }

  private void updateBackend()
  {
    try
    {
      stopService();
      msg("Recompiling wrappers and updating service WAR...");
      if (forkAndCheck(60000,
                       "Error compiling wrappers or updating the service.",
                       "ant",
                       "compile-wrappers-and-update"))
      {
        startService();
      }
    }
    catch (Exception e)
    {
      error("Error relaunching BS service.", null, e);
      return;
    }

    msg("Service started, running.");
  }

  private void stopService() throws Exception
  {
    msg("Stopping service...");
    service.stop();
  }

  private void startService() throws Exception
  {
    msg("Starting service...");
    service.start();
  }

  public static void main(String[] args) throws IOException
  {
    new AssistApp();
  }

}
