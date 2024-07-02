package designpatterns.strategy;

public class Context {

    private SortingStrategy sortingStrategy;


    public Context(SortingStrategy sortingStrategy){

        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void executeStrategy(){

        sortingStrategy.sort();

    }
}
