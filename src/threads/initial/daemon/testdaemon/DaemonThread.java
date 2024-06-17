package threads.initial.daemon.testdaemon;

public class DaemonThread extends Thread {

    public DaemonThread(){
        setDaemon(true);
    }

    @Override
    public void run()
    {
        for(int i = 0; i < 1000; i++)
        {
            System.out.println("This is daemon thread....."+i);
        }
    }


}
