package threads.initial.producerconumer;

import java.util.LinkedList;
import java.util.Queue;

public class AddElements {


    public final int capacity;
    public final Queue<Integer> queue = new LinkedList<>();

    public AddElements(int capacity){
        this.capacity=capacity;
    }

    boolean produce = false;
    public synchronized void produce(int n) throws InterruptedException{

        if(produce){

            wait();
        }

        queue.add(n);
        System.out.println(Thread.currentThread().getName() + " " + n);

        produce = true;

        Thread.sleep(1000);

        notify();
    }

    public synchronized void consume() throws InterruptedException{

        if(!produce){

            wait();
        }

        int consume = queue.remove();


        System.out.println(Thread.currentThread().getName() + " " + consume);

        produce = false;

        Thread.sleep(1000);

        notify();
    }

}
