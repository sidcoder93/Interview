package threads.initial.printOddEven;

public class EvenThread extends Thread{

    int limit;

    PrintNumber pn;

    public EvenThread(int limit, PrintNumber pn){

        this.limit = limit;
        this.pn = pn;
    }

    @Override
    public void run(){

        int i=2;

        while( i<=limit){

            pn.printEven(i);
            i+=2;

        }

    }
}
