package designpatterns.strategy;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort() {
        System.out.println("Sort using Bubble Sort");
    }
}
