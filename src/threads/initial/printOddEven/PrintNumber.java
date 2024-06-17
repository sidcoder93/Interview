package threads.initial.printOddEven;

import static java.lang.Thread.sleep;

public class PrintNumber {

    boolean isOddPrinted = false;
    synchronized void printOdd(int odd){

        if(isOddPrinted){

            try{
                wait();
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " " + odd);

        isOddPrinted= true;

        try{
            sleep(1000);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }

        notify();


    }

    synchronized void printEven(int even){

        if(!isOddPrinted){

            try{
                wait();
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " " + even);
        isOddPrinted = false;

        try {
            sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        notify();



    }
}
