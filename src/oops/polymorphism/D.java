package oops.polymorphism;

public class D {

    public static void main(String[] args) {

        A a = new A();

        a = new B();

        a = new C();

        a.m1();
    }
}
