package threads.initial.deadlock;

public class DeadLockInJava {


    public static void main(String[] args) {


        Shared s1 = new Shared();
        Shared s2 = new Shared();

        Thread t1 = new Thread(() -> s1.methodOne(s2));

        Thread t2 = new Thread(() -> s2.methodTwo(s1));

        t1.start();
        t2.start();
    }
}
