package ecologylab.bigsemantics.tools;

import java.awt.Component;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Path related UI components and utils.
 * 
 * @author quyin
 */
public class PathUtil
{

  public static File checkAndChooseDir(Component parentGui, String path, String description)
  {
    File file = new File(path);
    if (file.exists())
    {
      return file;
    }

    // warning
    String msg = "Cannot find " + description + ", will now ask for its path!";
    JOptionPane.showMessageDialog(parentGui, msg);

    // choose file
    JFileChooser chooser = new JFileChooser();
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int returnVal = chooser.showOpenDialog(parentGui);
    if (returnVal == JFileChooser.APPROVE_OPTION)
    {
      File result = chooser.getSelectedFile();
      if (result.exists() && result.isDirectory())
      {
        return result;
      }
    }

    return null;
  }

  public static File subPath(File dir, String... subs)
  {
    File f = dir;
    for (int i = 0; i < subs.length; ++i)
    {
      f = new File(f, subs[i]);
    }
    return f;
  }

}
