package ecologylab.bigsemantics.tools;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ecologylab.bigsemantics.html.utils.StringBuilderUtils;

/**
 * 
 * @author quyin
 */
public class MemoryUsageMonitor
{

  static Logger logger = LoggerFactory.getLogger(MemoryUsageMonitor.class);

  static long   MB     = 1024 * 1024;

  private int   free;

  private int   total;

  private int   max;

  private int   permGenFree;

  private int   permGenMax;

  private void updateMemStats()
  {
    try
    {
      updateMemStatsAndLog(null);
    }
    catch (IOException e)
    {
      // This should never happen.
      e.printStackTrace();
    }
  }

  private void updateMemStatsAndLog(Appendable app) throws IOException
  {
    Runtime runtime = Runtime.getRuntime();
    free = (int) (runtime.freeMemory() / MB);
    total = (int) (runtime.totalMemory() / MB);
    max = (int) (runtime.maxMemory() / MB);

    if (app != null)
    {
      app.append(String.format("General memory usage: %dMB/%dMB; ", total - free, max));
    }

    List<MemoryPoolMXBean> beans = ManagementFactory.getMemoryPoolMXBeans();
    if (beans != null && beans.size() > 0)
    {
      if (app != null)
      {
        app.append("Pool memory usage: ");
      }
      for (int i = 0; i < beans.size(); ++i)
      {
        MemoryPoolMXBean item = beans.get(i);
        String name = item.getName();
        MemoryUsage usage = item.getUsage();
        int poolUsed = (int) (usage.getUsed() / MB);
        int poolMax = (int) (usage.getMax() / MB);
        if (app != null)
        {
          app.append((i == 0) ? "" : ", ");
          app.append(String.format("%s=%dMB/%dMB", name, poolUsed, poolMax));
        }
        if (name.toLowerCase().contains("perm"))
        {
          permGenFree = poolMax - poolUsed;
          permGenMax = poolMax;
        }
      }
    }

  }

  /**
   * @return The smaller one of free general memory and perm gen memory, in MB.
   */
  public int getEffectiveFreeMem()
  {
    updateMemStats();
    return free > permGenFree ? permGenFree : free;
  }

  public void log(String additionalMessage)
  {
    StringBuilder sb = StringBuilderUtils.acquire();
    sb.append(additionalMessage).append(": ");
    try
    {
      updateMemStatsAndLog(sb);
      logger.info(sb.toString());
    }
    catch (IOException e)
    {
      logger.error("Cannot print to stream.", e);
      e.printStackTrace();
    }
    finally
    {
      StringBuilderUtils.release(sb);
    }
  }

  static MemoryUsageMonitor monitor = new MemoryUsageMonitor();

  public static MemoryUsageMonitor get()
  {
    return monitor;
  }

  public static void main(String[] args)
  {
    MemoryUsageMonitor.get().log("Test");
    int effectiveFreeMem = MemoryUsageMonitor.get().getEffectiveFreeMem();
    System.err.println("Effective free mem: " + effectiveFreeMem + "MB");
  }

}
