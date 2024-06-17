package threads.initial;

public class ClassA extends Thread{

    @Override
    public void run(){
      //  keep the task to be performed here

        System.out.println(Thread.currentThread().getPriority());
        for (int i=0; i<10; i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread Name: "+ Thread.currentThread().getName() + " "+   i);
        }

    }
}
