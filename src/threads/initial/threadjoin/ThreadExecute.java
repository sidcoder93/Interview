package threads.initial.threadjoin;

public class ThreadExecute {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " started");

        X x = new X("ThreadX");
        Y y = new Y();
        Z z = new Z();

        x.start();
        x.join();

        y.start();
        y.join(7000);

        z.start();
        z.join(9000);

        System.out.println(Thread.currentThread().getName() + " finished");


    }
}
