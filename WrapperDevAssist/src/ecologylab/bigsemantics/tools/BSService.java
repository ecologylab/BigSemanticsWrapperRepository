package ecologylab.bigsemantics.tools;

import java.io.File;
import java.io.IOException;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.webapp.WebAppContext;
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

  private File          bsJsDir;

  private int           servicePort;

  private Server        server;

  private ProcessHelper downloaderProc;

  public BSService(Configuration configs)
  {
    serviceDir = new File(configs.getString("bigsemantics_service_dir"));
    bsJsDir = new File(configs.getString("bigsemantics_javascript_dir"));
    servicePort = configs.getInt("service_port");
  }

  public void start() throws Exception
  {
    runServer();
    runDownloader();
  }

  public void stop() throws Exception
  {
    stopServer();
    stopDownloader();
  }

  private void runServer() throws Exception
  {
    HandlerCollection handlers = new ContextHandlerCollection();

    File dpoolWarPath =
        PathUtil.subPath(serviceDir, "DownloaderPool", "build", "DownloaderPool.war");
    WebAppContext context1 =
        new WebAppContext(handlers, dpoolWarPath.getAbsolutePath(), "/DownloaderPool");
    handlers.addHandler(context1);

    File serviceWarPath =
        PathUtil.subPath(serviceDir, "BigSemanticsService", "build", "BigSemanticsService.war");
    WebAppContext context2 =
        new WebAppContext(handlers, serviceWarPath.getAbsolutePath(), "/BigSemanticsService");
    handlers.addHandler(context2);

    ContextHandler c = new ContextHandler("/");
    ResourceHandler resourceHandler = new ResourceHandler();
    resourceHandler.setResourceBase(bsJsDir.getAbsolutePath());
    resourceHandler.setDirectoriesListed(true);
    c.setHandler(resourceHandler);
    handlers.addHandler(c);

    server = new Server(servicePort);
    server.setHandler(handlers);
    logger.info("starting dpool+bigsemantics services...");
    server.start();
    for (int i = 0; i < 30; ++i)
    {
      if (server.isRunning())
      {
        break;
      }
      Thread.sleep(500);
    }

    if (!server.isRunning())
    {
      throw new RuntimeException("Failed to start the BigSemantics web service(s).");
    }

    logger.info("dpool+bigsemantics services started.");
  }

  private void stopServer() throws Exception
  {
    if (server == null)
    {
      return;
    }

    logger.info("stopping dpool+bigsemantics services...");
    server.stop();

    for (int i = 0; i < 30; ++i)
    {
      if (server.isStopped())
      {
        break;
      }
      Thread.sleep(500);
    }

    if (!server.isStopped())
    {
      throw new RuntimeException("Failed to stop the BigSemantics web service(s).");
    }

    server = null;
    logger.info("dpool+bigsemantics services stopped.");
  }

  private void runDownloader() throws IOException, InterruptedException
  {
    stopDownloader();
    String downloaderJarPath =
        PathUtil.subPath(serviceDir, "DownloaderPool", "build", "Downloader.jar").getAbsolutePath();
    logger.info("starting downloader...");
    downloaderProc = new ProcessHelper("java", "-Xms128m", "-jar", downloaderJarPath);
    downloaderProc.start();
    logger.info("downloader started.");
  }

  private void stopDownloader() throws InterruptedException
  {
    if (downloaderProc != null)
    {
      logger.info("stopping downloader...");
      downloaderProc.stop();
      downloaderProc = null;
      logger.info("downloader stopped.");
    }
  }

  public static void main(String[] args) throws Exception
  {
    Configuration configs = new PropertiesConfiguration("wrapper-dev-assist.conf");
    BSService runner = new BSService(configs);
    runner.start();
    runner.server.join();
    // Thread.sleep(60000);
    // logger.info("requesting stop ...");
    // runner.stop();
  }

}
