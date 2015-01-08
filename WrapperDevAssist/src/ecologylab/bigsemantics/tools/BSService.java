package ecologylab.bigsemantics.tools;

import java.io.File;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A class for running and stopping the BigSemantics service suite (including a downloading service,
 * an extraction service, and a downloading worker).
 * 
 * @author quyin
 */
public class BSService
{

  static Logger         logger = LoggerFactory.getLogger(BSService.class);

  private File          serviceDir;

  private File          jsDir;

  private ProcessHelper serviceProc;

  public BSService(Configuration configs)
  {
    serviceDir = new File(configs.getString("bigsemantics_service_dir"));
    jsDir = new File(configs.getString("bigsemantics_javascript_dir"));
    logger.info("Notice: changing servicePort to other than 8080 is not yet supported.");
  }

  public void start() throws Exception
  {
    if (serviceProc == null)
    {
      File serviceJarFile =
          PathUtil.subPath(serviceDir, "BigSemanticsService", "build", "BigSemanticsService.jar");
      String serviceJarPath = serviceJarFile.getAbsolutePath();
      logger.info("starting bigsemantics service ...");
      serviceProc = new ProcessHelper("java", "-server", "-jar", serviceJarPath,
                                      "--static_dir=" + jsDir.getCanonicalPath());
      serviceProc.start();
      logger.info("bigsemantics service started.");
    }
  }

  public void stop() throws Exception
  {
    if (serviceProc != null)
    {
      logger.info("stopping bigsemantics service...");
      serviceProc.stop();
      serviceProc = null;
      logger.info("bigsemantics service stopped.");
    }
  }

  public static void main(String[] args) throws Exception
  {
    Configuration configs = new PropertiesConfiguration("wrapper-dev-assist.conf");
    for (int i = 0; i < 10; ++i)
    {
      BSService runner = new BSService(configs);
      runner.start();
      MemoryUsageMonitor.get().log("New service instance ...");
      int interval = (i == 0) ? 30000 : 5000;
      Thread.sleep(interval);
      logger.info("requesting stop ...");
      runner.stop();
    }
  }

}
