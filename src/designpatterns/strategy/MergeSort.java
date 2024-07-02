package designpatterns.strategy;

public class MergeSort implements SortingStrategy{
    @Override
    public void sort() {
        System.out.println("Sorting using Merge sort");
    }
}
