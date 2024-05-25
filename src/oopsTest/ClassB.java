package oopsTest;

public class ClassB extends ClassA{


    ClassA classA;

    public ClassB(ClassA a){
        this.classA =a;
    }
       public void m1(){

           System.out.println("B");
          classA.m1();
       }
}
