package oopsTest;

public class IntandFloatTest {

    public static void m1(int i , float f){
        System.out.println("Print1");
    }

    public static void m1 (float f, int i){
        System.out.println("print 2");
    }
    public static void m1(int i, Number n){
        System.out.println("print 3");
    }

    public static void m1(double d, float i){
        System.out.println("print 4");
    }

    public static void main(String[] args) {
        m1(10f,10);
    }
}
