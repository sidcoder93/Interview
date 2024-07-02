package designpatterns.strategy;

public class Main {

    public static void main(String[] args) {


        Context context = new Context(new BubbleSort());
        context.executeStrategy();

        Context context1 = new Context(new SelectionSort());
        context1.executeStrategy();

        Context context2 = new Context(new MergeSort());
        context2.executeStrategy();
    }
}
