package oops.polymorphism.question5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };



        List<Object> flattenedList = flatten(array);

        Object[] flattenedArray = flattenedList.toArray();
        for (Object obj : flattenedArray) {
            System.out.print(obj + " ");
        }


    }

    public static List<Object> flatten(Object[] array) {
        List<Object> resultList = new ArrayList<>();
        flatten(array, resultList);
        return resultList;
    }

    private static void flatten(Object[] array, List<Object> resultList) {
        for (Object element : array) {
            if (element instanceof Object[]) {
                // Recursively flatten the nested array
                flatten((Object[]) element, resultList);
            } else {
                // Add non-array elements directly to the result list
                resultList.add(element);
            }
        }


    }

}
