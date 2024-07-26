package oops.abstraction;

public class Main {

    public static void main(String[] args) {



        Dog dog = new Dog("dog");

        Cat cat = new Cat("cat");

        Animal a = dog;

        a = cat;

        System.out.println(dog.name);

        System.out.println(a.name);

    }
}
