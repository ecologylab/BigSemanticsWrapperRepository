package ecologylab.bigsemantics.tools;

import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

/**
 * Run ant target.
 * 
 * @author quyin
 */
public class AntRunner
{

  public void runAntTarget(File buildFile, String target) throws BuildException
  {
    Project p = new Project();
    p.init();
    ProjectHelper.configureProject(p, buildFile);
    p.executeTarget(target);
  }

}
