package threads.initial.differentWays;

public class UsageClass {

    public static class Thread1 extends Thread {

        @Override
        public void run(){
            System.out.println("Inside Thread1 static inner class");
        }
    }

    public static class Thread2 implements Runnable {

        @Override
        public void run(){
            System.out.println("Inside Thread2 static inner class");
        }
    }
}
