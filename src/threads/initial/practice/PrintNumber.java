package threads.initial.practice;

public class PrintNumber {

    public void print(int n) {

        try {

            Thread.sleep(1000);

            System.out.println("Number print is "+ n);


        }catch (InterruptedException ex) {
            ex.printStackTrace();
        }




    }
}
