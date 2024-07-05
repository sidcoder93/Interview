package prac;

public class FabonacciTest {

    public static void main(String[] args) {

       for(int i=0; i<=100; i++){

           System.out.print(fib(i) + " ");
       }

    }

    static int fib(int N){


        int x;
        if(N==1 || N==0){
            return N;
        }

        x=  fib(N-1) + fib(N-2);

        return x;

    }
}
