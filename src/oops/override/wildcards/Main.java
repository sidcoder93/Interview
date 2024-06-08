package oops.override.wildcards;

import oops.override.A;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cat> list  = new ArrayList<>();
        list.add(new Cat());
        list.add(new Cat());

        add(list);


    }

    public static void add(List<? extends Animal>  animals){

        System.out.println(animals.toString());
    }
}
