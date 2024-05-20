package prac;

public class FabonacciTest {

    public static void main(String[] args) {

        System.out.println("Fibonacci of 10: " +fib(10) );

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
