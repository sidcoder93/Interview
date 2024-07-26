package threads.initial.sleep;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("Main method start" + LocalDateTime.now());

        MyThread myThread = new MyThread();

        myThread.start();

        try
        {
            myThread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Main method Ends" + LocalDateTime.now());

        System.out.println();
    }
}
