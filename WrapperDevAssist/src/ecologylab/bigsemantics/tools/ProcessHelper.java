package ecologylab.bigsemantics.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A simple helper class for process manipulation.
 * 
 * @author Yin Qu
 */
public class ProcessHelper implements Runnable
{

  /**
   * Listener for process output.
   * 
   * @author Yin Qu
   */
  public static interface OutputListener
  {

    /**
     * Will be called when the process outputs.
     * 
     * @param line
     */
    void onOutput(String line);

  }

  static Logger          logger = LoggerFactory.getLogger(ProcessHelper.class);

  private OutputListener outListener;

  private ProcessBuilder processBuilder;

  private Process        process;

  private BufferedReader outputReader;

  private BufferedReader errorReader;

  private boolean        running;

  /**
   * Constructor.
   * 
   * @param cmds
   */
  public ProcessHelper(String... cmds)
  {
    processBuilder = new ProcessBuilder(cmds);
  }

  public OutputListener getOutListener()
  {
    return outListener;
  }

  /**
   * If no outListener set, the output will be simply discarded.
   * 
   * @param outListener
   */
  public void setOutListener(OutputListener outListener)
  {
    this.outListener = outListener;
  }

  public void start() throws IOException
  {
    if (!running)
    {
      synchronized (this)
      {
        if (!running)
        {
          running = true;
          processBuilder.redirectErrorStream(true);
          process = processBuilder.start();
          outputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
          errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
          new Thread(this).start();
        }
      }
    }
  }

  public void stop()
  {
    process.destroy();
    synchronized (this)
    {
      running = false;
    }
  }

  @Override
  public void run()
  {
    while (running)
    {
      synchronized (this)
      {
        if (running)
        {
          String line = null;
          try
          {
            line = outputReader.readLine();
            errorReader.readLine();
          }
          catch (IOException e)
          {
            logger.error("I/O error when reading output.", e);
          }
          if (line == null)
          {
            break;
          }
          else
          {
            if (outListener != null)
            {
              outListener.onOutput(line);
            }
          }
        } // if (!stopRequested)
      } // synchronized
    } // while
  }

}
