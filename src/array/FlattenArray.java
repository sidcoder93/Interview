package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray {


    public static void main(String[] args) {


        Object[] arr = {1,2, new Object[]{3,4,5 ,new Object[] {6,7}, 9}, 10};

        List<Object> list = new ArrayList<>();
        flatten(arr, list);
        System.out.println(list);
    }


    public static void flatten (Object [] aaray, List<Object> list){

        for(Object element : aaray) {

            if(element instanceof Object[]) {

                flatten((Object [])element, list);
            }
            else {
                list.add(element);
            }
        }










    }




}
