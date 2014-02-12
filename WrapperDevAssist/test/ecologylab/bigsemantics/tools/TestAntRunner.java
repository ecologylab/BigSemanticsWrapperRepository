package ecologylab.bigsemantics.tools;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class TestAntRunner
{

  @Test
  public void testAntRunner()
  {
    File buildFile = new File("../../BigSemanticsService/DownloaderPool/build.xml");
    if (!buildFile.exists())
    {
      System.err.println("Build file not found.");
      System.exit(-1);
    }
    AntRunner ar = new AntRunner();
    ar.runAntTarget(buildFile, "downloader-jar");
    File jarFile = new File("../../BigSemanticsService/DownloaderPool/build/Downloader.jar");
    assertTrue(jarFile.exists());
  }

}
