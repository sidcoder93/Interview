package threads.initial.printOddEven;

public class Main {


    public static void main(String[] args) {

        PrintNumber pn = new PrintNumber();

        OddThread oddThread= new OddThread(20, pn);

        EvenThread evenThread = new EvenThread(20, pn);


        oddThread.start();
        evenThread.start();

    }
}
