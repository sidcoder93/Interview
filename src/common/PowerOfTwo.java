package common;

public class PowerOfTwo {

    public static void main(String[] args) {

        checkPowerOfTwo(1);
        checkPowerOfFour(16);

    }

    public static void checkPowerOfTwo(int n){

        if(n<=1){
            System.out.println("Not a power of 2");
            return;
        }

        while(n != 1){

            if(n%2 != 0){
                System.out.println("Not power of Two");
                return;
            }

            n = n/2;
        }

        System.out.println(" Power of Two");

    }

    public static  void checkPowerOfFour(int n){

        while (n != 1){

            if(n%4 != 0){
                System.out.println("Not a power of 4");
                return;
            }

            n = n/4;
        }

        System.out.println("Power of 4");


    }
}
