package threads.initial.threadinterfere;

public class Shared {

    int i;

    synchronized  void SharedMethod(){
        System.out.println("[START] "+Thread.currentThread().getName());
        i = 10;
        System.out.println(i);
        i = 20;
        System.out.println(i);
        i = 30;
        System.out.println(i);
        i=40;
        System.out.println(i);
        i=50;
        System.out.println(i);
        System.out.println("[END] "+Thread.currentThread().getName());
    }
}
