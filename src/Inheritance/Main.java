package Inheritance;

public class Main {

    public static void main(String[] args) {

        ClassA a = new ClassB();

        System.out.println(a.i);

        System.out.println(((ClassB)a).i);
          a.m1();

          TestA testa = new TestA();
    }
}
