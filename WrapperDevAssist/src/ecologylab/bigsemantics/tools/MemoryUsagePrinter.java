package ecologylab.bigsemantics.tools;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;
import java.util.List;

/**
 * 
 * @author quyin
 */
public class MemoryUsagePrinter
{

  static long MB = 1024 * 1024;

  public static void printGeneral(String additionalMessage)
  {
    if (additionalMessage == null)
    {
      additionalMessage = "";
    }

    Runtime runtime = Runtime.getRuntime();
    long total = runtime.totalMemory();
    long free = runtime.freeMemory();
    long max = runtime.maxMemory();

    StringBuilder sb = new StringBuilder();
    sb.append("General memory usage ").append(additionalMessage).append(": ");
    sb.append((total - free) / MB).append("MB/").append(max / MB).append("MB");

    System.err.println(sb.toString());
  }

  public static void printPool(String additionalMessage)
  {
    if (additionalMessage == null)
    {
      additionalMessage = "";
    }

    StringBuilder sb = new StringBuilder();
    sb.append("Memory pool usage ").append(additionalMessage).append(": ");

    List<MemoryPoolMXBean> beans = ManagementFactory.getMemoryPoolMXBeans();
    for (int i = 0; i < beans.size(); ++i)
    {
      MemoryPoolMXBean item = beans.get(i);
      String name = item.getName();
      MemoryUsage usage = item.getUsage();
      sb.append((i==0)?"":", ").append(name).append("=");
      sb.append(usage.getUsed() / MB).append("MB/").append(usage.getMax() / MB).append("MB");
    }

    System.err.println(sb.toString());
  }

  public static void printAll(String additionalMessage)
  {
    printGeneral(additionalMessage);
    printPool(additionalMessage);
  }

}
