package ecologylab.bigsemantics.tools;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
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
import javax.swing.JTextArea;

import org.apache.commons.configuration.ConfigurationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AssistApp extends WindowAdapter
{

  static Logger logger = LoggerFactory.getLogger(AssistApp.class);

  JButton       btnUpdate;

  JTextArea     textArea;

  BSService     service;

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
            logger.info(">> " + line);
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
      logger.error("Error executing " + cmds, e);
      return Long.MIN_VALUE + 1;
    }
    catch (InterruptedException e)
    {
      logger.error("Error executing " + cmds, e);
      return Long.MIN_VALUE + 2;
    }
    catch (ExecutionException e)
    {
      logger.error("Error executing " + cmds, e);
      return Long.MIN_VALUE + 3;
    }
  }

  public boolean checkEnv() throws IOException
  {
    long err = fork(500, "ant", "-version");
    if (err != 0)
    {
      logger.error("ant checking result: " + err);
      logger.error("Apache Ant needed but not detected.");
      return false;
    }

    err = fork(500, "mvn", "-version");
    if (err != 0)
    {
      logger.error("ant checking result: " + err);
      logger.error("Apache Ant needed but not detected.");
      return false;
    }
    
    // TODO check required service projects

    return true;
  }

  public void display()
  {
    try
    {
      service = new BSService();
    }
    catch (ConfigurationException e)
    {
      logger.error("Error starting up the BS service.", e);
    }
    
    btnUpdate = new JButton("Update Backend with New Wrappers");
    btnUpdate.setVerticalTextPosition(AbstractButton.CENTER);
    btnUpdate.setHorizontalTextPosition(AbstractButton.CENTER);
    btnUpdate.setMnemonic(KeyEvent.VK_U);
    btnUpdate.setActionCommand("update");
    btnUpdate.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent event)
      {
        if ("update".equals(event.getActionCommand()))
        {
          update();
        }
      }
    });

    JPanel contentPanel = new JPanel(new GridBagLayout());
    contentPanel.setOpaque(true);

    GridBagConstraints c =
        new GridBagConstraints(1, // gridx
                               0, // gridy
                               1, // gridwidth
                               1, // gridheight
                               0.3f, // weightx
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
    c.gridx = 1;
    c.gridy = 1;
    c.weightx = 1;
    c.weighty = 1;
    c.fill = GridBagConstraints.BOTH;
    contentPanel.add(textArea, c);

    final JFrame frame = new JFrame("BS Wrapper Dev Assist");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.addWindowListener(this);
    frame.setContentPane(contentPanel);
    javax.swing.SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        frame.pack();
        frame.setVisible(true);
      }
    });
  }

  private void update()
  {
    logger.info("recompiling ...");
    // TODO recompile and update jars/wars

    logger.info("relaunching BS service ...");
    try
    {
      service.stop();
      service.start();
    }
    catch (Exception e)
    {
      logger.error("Error relaunching BS service.", e);
    }
  }

  @Override
  public void windowClosing(WindowEvent arg0)
  {
    logger.info("window is closing, cleaning up ...");
    try
    {
      service.stop();
    }
    catch (Exception e)
    {
      logger.error("Error stopping BS service.", e);
    }
  }

  public static void main(String[] args) throws IOException
  {
    AssistApp app = new AssistApp();
    if (app.checkEnv())
    {
      app.display();
    }
  }

}
