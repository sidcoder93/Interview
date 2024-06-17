package threads.initial.threadinterfere;

public class ThreadsInJava {

    /**
     *How To Avoid Thread Interference or How To Achieve Thread Safeness?
     * Following are some methods which are used to avoid thread interference in java.(These methods will be discussed in detail in subsequent articles).
     *
     * By declaring the method as synchronized.
     * By declaring the variables as final.
     * By declaring the variable as volatile.
     * By creating the immutable objects.
     * By using Atomic operations.
     * By restricting the access to same object by multiple threads.
     */

    public static void main(String[] args) {
        final Shared s1 = new Shared();

        Thread t1 = new Thread(s1::SharedMethod);

        Thread t2 = new Thread(s1::SharedMethod);

        t1.start();

        t2.start();
    }
}
