package Decorator;

public class Milk extends CoffeeDecorator{

    Coffee coffee;
    public Milk(Coffee coffee){

        super(coffee);
    }

    @Override
    public double getCost(){

       return super.getCost() + 0.5;
    }
    @Override
    public String getDescription(){

        return super.getDescription() + "Add Milk";

        //return "Add Milk";
    }


}
