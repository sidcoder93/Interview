package threads.initial.daemon;

class Thread1 extends Thread
{
    @Override
    public void run()
    {
        Thread t = new Thread();      //Creating a child thread

        System.out.println(t.isDaemon());   //Checking the Daemon property of a child thread
    }
}