package ecologylab.bigsemantics.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author quyin
 */
public class Forker
{

  public static class Result
  {

    public long   returnCode;

    public String out;

    public String err;

  }
  
  private static final Logger logger = LoggerFactory.getLogger(Forker.class);

  private static final int CHAR_BUF_SIZE = 0;

  public Result fork(long timeout, String... cmds)
  {
    StringBuilder sbOut = new StringBuilder();
    StringBuilder sbErr = new StringBuilder();
    Result result = new Result();
    try
    {
      result.returnCode = fork(timeout, sbOut, sbErr, cmds);
    }
    catch (IOException e)
    {
      logger.error("Error executing cmds: " + cmds, e);
      result.returnCode = Long.MIN_VALUE + 1;
    }
    catch (InterruptedException e)
    {
      logger.error("Error executing cmds: " + cmds, e);
      result.returnCode = Long.MIN_VALUE + 2;
    }
    catch (ExecutionException e)
    {
      logger.error("Error executing cmds: " + cmds, e);
      result.returnCode = Long.MIN_VALUE + 3;
    }
    result.out = sbOut.toString();
    result.err = sbErr.toString();
    return result;
  }

  public int fork(long timeout, final Appendable outBuf, final Appendable errBuf, String... cmds)
      throws IOException, InterruptedException, ExecutionException
  {
    ProcessBuilder pb = new ProcessBuilder(cmds);
    final Process p = pb.start();

    ExecutorService executor = Executors.newSingleThreadExecutor();
    Future<Integer> future = executor.submit(new Callable<Integer>()
    {
      @Override
      public Integer call() throws Exception
      {
        streamToBuf(p.getInputStream(), outBuf);
        streamToBuf(p.getErrorStream(), errBuf);
        return p.waitFor();
      }
    });
    executor.awaitTermination(timeout, TimeUnit.MILLISECONDS);
    executor.shutdown();
    return future.get();
  }

  private void streamToBuf(InputStream istream, Appendable buf) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(istream));
    while (true)
    {
      String line = br.readLine();
      if (line == null)
      {
        break;
      }
      else
      {
        logger.debug("    >> " + line);
        if (buf != null)
        {
          buf.append(line).append("\n");
        }
      }
    }
  }

}
