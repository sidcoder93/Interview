package threads.initial;

public class ClassB implements Runnable{



    @Override
    public void run(){

        System.out.println("Thread B priority: "+Thread.currentThread().getPriority());

        for (int i=10; i<20; i++){
            System.out.println("Thread Name: "+ Thread.currentThread().getName() + " "+   i);
        }

    }
}
