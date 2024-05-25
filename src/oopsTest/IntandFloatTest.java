package oopsTest;

public class IntandFloatTest {

    public static void m1(int i , float f){
        System.out.println("Print1");
    }

    public static void m1 (double f, int i){
        System.out.println("print 2");
    }

    public static void main(String[] args) {
        m1(10,10f);
    }
}
