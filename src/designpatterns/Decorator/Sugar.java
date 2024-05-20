package designpatterns.Decorator;

public class Sugar extends CoffeeDecorator{


    public Sugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost(){

        return super.getCost() + 1.0;
    }

    public String getDescription() {

        return super.getDescription() + "Add Sugar";
    }
}
