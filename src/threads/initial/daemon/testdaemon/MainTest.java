package threads.initial.daemon.testdaemon;

/**
 * Demonstration of User thread and daemon thread  :
 * In the below program, The task of daemon thread will not be completed.
 * Program terminates as soon as user thread finishes it’s task. It will not wait for daemon thread to finish it’s task.
 */
public class MainTest {

    public static void main(String[] args) {

        DaemonThread daemon = new DaemonThread();
        daemon.start();

        UserThread userThread = new UserThread();   //Creating the UserThread

        userThread.start();


    }
}
