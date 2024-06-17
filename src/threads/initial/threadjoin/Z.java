package threads.initial.threadjoin;

public class Z extends Thread{

    @Override
    public void run(){

        for (int i=200; i<300; i++){
            System.out.println(i);
        }
    }
}
