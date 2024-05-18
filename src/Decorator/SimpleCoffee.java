package Decorator;

public class SimpleCoffee implements Coffee{


    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "Its a Simple Coffee";
    }
}
