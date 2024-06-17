package threads.initial.threadjoin;

public class X extends Thread{

    public X(String name){
        super(name);
    }

    @Override
    public void run(){

        for(int i=0; i<100; i++){
            System.out.println(i);
        }
    }
}
