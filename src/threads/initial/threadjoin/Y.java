package threads.initial.threadjoin;

public class Y extends Thread{

    @Override
    public void run() {

        for (int i=100; i<200; i++){
            System.out.println(i);
        }

    }
}
