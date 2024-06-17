package threads.initial.producerconumer;

public class Consume extends Thread{

    AddElements addElements;

    public Consume(AddElements addElements){
        this.addElements = addElements;
    }

    @Override
    public void run(){

        try {

            sleep(1000);
            for(int i=0; i<=10; i++) {
                addElements.consume();
            }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
}
