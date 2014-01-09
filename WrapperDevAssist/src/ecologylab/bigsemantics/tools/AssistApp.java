package ecologylab.bigsemantics.tools;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

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

public class AssistApp extends WindowAdapter
{

  static Logger   logger         = LoggerFactory.getLogger(AssistApp.class);

  JButton         btnUpdate;

  JTextArea       textArea;

  BSService       service;

  JFrame          frame;
  
  public AssistApp()
  {
    try
    {
      service = new BSService();
    }
    catch (ConfigurationException e)
    {
      error("Error starting up the BS service.", e);
      return;
    }

    createGUI();
    display();
    msg("Initializing...");

    if (!checkEnv())
    {
      error("Failed to start up! Please check your environment.");
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
          error("Error stopping BS service.", e);
        }
      }

    });
    frame.setContentPane(contentPanel);
  }

  private boolean checkEnv()
  {
    if (0 != fork(500, "ant", "-version"))
    {
      error("Error detecting Apache Ant which is needed.");
      return false;
    }

    if (0 != fork(500, "mvn", "-version"))
    {
      error("Error detecting Apache Maven which is needed.");
      return false;
    }

    if (0 != fork(15000, "ant", "build-dpool"))
    {
      error("Error building required WAR and JAR from DownloaderPool.");
      return false;
    }
    
    File f = new File("../../BigSemanticsJavaScript");
    if (!f.exists())
    {
      error("Error locating project BigSemanticsJavaScript.");
      return false;
    }

    return true;
  }

  private long fork(final long timeout, String... cmds)
  {
    ProcessBuilder pb = new ProcessBuilder(cmds);
    pb.redirectErrorStream(true);
    try
    {
      final Process p = pb.start();

      ExecutorService executor = Executors.newSingleThreadExecutor();
      Future<Integer> future = executor.submit(new Callable<Integer>()
      {
        @Override
        public Integer call() throws Exception
        {
          BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
          while (true)
          {
            String line = br.readLine();
            if (line == null)
            {
              break;
            }
            msg("  >> " + line);
            SwingUtilities.invokeLater(new Runnable()
            {
              @Override
              public void run()
              {
                frame.invalidate();
              }
            });
          }
          return p.waitFor();
        }
      });
      executor.awaitTermination(timeout, TimeUnit.MILLISECONDS);
      executor.shutdown();
      return future.get();
    }
    catch (IOException e)
    {
      error("Error executing " + cmds, e);
      return Long.MIN_VALUE + 1;
    }
    catch (InterruptedException e)
    {
      error("Error executing " + cmds, e);
      return Long.MIN_VALUE + 2;
    }
    catch (ExecutionException e)
    {
      error("Error executing " + cmds, e);
      return Long.MIN_VALUE + 3;
    }
  }

  private void msg(String msg)
  {
    logger.info(msg);
    textArea.append(msg + "\n");
    textArea.setCaretPosition(textArea.getDocument().getLength());
    SwingUtilities.invokeLater(new Runnable()
    {
      @Override
      public void run()
      {
        frame.invalidate();
      }
    });
  }

  private void error(String msg, Throwable t)
  {
    logger.error(msg, t);
    msg("ERROR: " + msg);
  }
  
  private void error(String msg)
  {
    error(msg, null);
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

  private void updateBackend()
  {
    try
    {
      stopService();
      msg("Recompiling wrappers and updating service WAR...");
      fork(60000, "ant", "compile-wrappers-and-update");
      startService();
    }
    catch (Exception e)
    {
      error("Error relaunching BS service.", e);
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
