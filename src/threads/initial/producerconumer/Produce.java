package threads.initial.producerconumer;

public class Produce extends Thread{

    AddElements addElements;

    public Produce(AddElements addElements){
        this.addElements = addElements;
    }

    @Override
    public void run(){

        for(int i=0; i<=10; i++){

            try {
                addElements.produce(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
