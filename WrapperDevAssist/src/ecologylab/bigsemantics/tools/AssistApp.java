package ecologylab.bigsemantics.tools;

import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AssistApp extends WindowAdapter
{

  static Logger logger = LoggerFactory.getLogger(AssistApp.class);

  public void display()
  {
    JButton btnUpdate;
    btnUpdate = new JButton("(Re)compile and (re)launch BS service");
    btnUpdate.setVerticalTextPosition(AbstractButton.CENTER);
    btnUpdate.setHorizontalTextPosition(AbstractButton.CENTER);
    btnUpdate.setMnemonic(KeyEvent.VK_R);
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

    JPanel contentPanel = new JPanel();
    contentPanel.setOpaque(true);
    contentPanel.add(btnUpdate);

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
    logger.info("updating jars and wars ...");
    logger.info("relaunching BS service ...");
    // TODO recompile, update jars/wars, and relaunch service.

  }

  @Override
  public void windowClosing(WindowEvent arg0)
  {
    logger.info("window is closing, cleaning up ...");
    // TODO Auto-generated method stub

  }

  public static void main(String[] args)
  {
    AssistApp app = new AssistApp();
    app.display();
  }

}
