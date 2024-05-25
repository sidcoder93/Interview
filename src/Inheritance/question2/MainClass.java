package Inheritance.question2;

public class MainClass {
    public static void main(String[] args) {
        A a = new A();

        B b = new B(a);

        System.out.println(a.i);     // Prints 1212
        System.out.println(b.i);     // Also prints 1212 because B extends A
        System.out.println(b.a.i);   // Also prints 1212 because b.a refers to the same object as a

        b.a.i = 2121;                // Modifying b.a also modifies a, since they refer to the same object

        b.i = 1234;

        System.out.println("--------");

        System.out.println(a.i);     // Prints 2121, as it was modified
        System.out.println(b.i);     // Still prints 1212, because b is a separate object
    }
}
