package threads.initial.producerconumer;

public class Main {

    public static void main(String[] args) {


        AddElements addElements = new AddElements(20);

        Produce produce = new Produce(addElements);
        Consume consume = new Consume(addElements);

        produce.start();
        consume.start();
    }
}
