package threads.initial;

public class Main {


    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        ClassA t1 = new ClassA();
        Thread t2 = new Thread(new ClassB());

        t1.setName("Thread A");
        t2.setName("Thread B");

        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName());



    }
}
