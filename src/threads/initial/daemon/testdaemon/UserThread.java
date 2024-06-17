package threads.initial.daemon.testdaemon;

class UserThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("This is a user thread.....");
    }
}
