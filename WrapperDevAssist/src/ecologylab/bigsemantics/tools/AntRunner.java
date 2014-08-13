package ecologylab.bigsemantics.tools;

import java.io.File;

import org.apache.tools.ant.BuildEvent;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.BuildListener;
import org.apache.tools.ant.DefaultLogger;
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
    DefaultLogger logger = new DefaultLogger();
    logger.setOutputPrintStream(System.out);
    logger.setErrorPrintStream(System.err);
    logger.setMessageOutputLevel(Project.MSG_INFO);
    
    Project p = new Project();
    p.addBuildListener(logger);
    p.init();
    ProjectHelper.configureProject(p, buildFile);
    p.executeTarget(target);
    
    System.out.flush();
  }

}
