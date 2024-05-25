package oopsTest;

public class Main {

    public static void main(String[] args) {


        ClassA A = new ClassB(new ClassA());


        ClassA a = new ClassA();


        A.m1();

        a.m1();


    }
}
