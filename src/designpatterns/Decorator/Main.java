package designpatterns.Decorator;

public class Main {

    public static void main(String[] args) {


        Coffee coffee = new SimpleCoffee();

        System.out.println(coffee.getDescription() + " " +coffee.getCost());

        coffee = new Milk(coffee);

        System.out.println(coffee.getDescription() + " " + coffee.getCost());

        //Coffee sugarMilkCoffee = new Sugar(new Milk(new SimpleCoffee()));

        coffee = new Sugar(coffee);

        System.out.println(coffee.getDescription() + "  " + coffee.getCost());



        //System.out.println( sugarMilkCoffee.getDescription() + sugarMilkCoffee.getCost());



       // System.out.println("This is " + milkCoffee.getDescription() + "and its cost is "+ milkCoffee.getCost());




    }
}
