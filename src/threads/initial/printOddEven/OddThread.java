package threads.initial.printOddEven;

public class OddThread extends Thread {

    int limit;

    PrintNumber pn;

    public OddThread(int limit, PrintNumber pn){

        this.limit = limit;
        this.pn = pn;
    }

    @Override
    public void run(){

         int i=1;

        while( i<=limit){

            pn.printOdd(i);
            i+=2;

        }

    }

}
