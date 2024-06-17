package threads.initial.differentWays;

public class Main {

    public static void main(String[] args) {

        UsageClass.Thread1 t1 = new UsageClass.Thread1();
        t1.start();

        UsageClass.Thread2 thread2 = new UsageClass.Thread2();
        Thread t2 = new Thread(thread2);
        t2.start();

    }
}
