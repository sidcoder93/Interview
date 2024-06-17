package threads.initial.daemon;

public class ThreadsInJava
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();   //Creating the Thread1

        t1.start();                 //Starting the thread

        Thread1 t2 = new Thread1();   //Creating the Thread1

        t2.setDaemon(true);         //changing the thread as Daemon

        t2.start();          //Starting the thread
    }
}
