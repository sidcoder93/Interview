package threads.initial.practice;

public class Main {


    public static void main(String[] args)  {

      PrintNumber pn = new PrintNumber();


          Thread t1 = new Thread(() -> pn.print(5));

          Thread t2 = new Thread(() -> pn.print(10));

          t1.start();
          t2.start();



    }
}
