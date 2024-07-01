package array;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {

    public static void main(String[] args) {


        int[] arr = {1,2,2,2,3,4,5,6,6,6,6,7,7,2,4,1,5};


        Map<Integer, Integer> map = new HashMap<>();

        for(int x : arr){

            map.put(x, map.getOrDefault(x,0)+1);
        }

            /*for (Map.Entry<Integer, Integer> count : map.entrySet()){

                if(count.getValue()%2 != 0){

                    System.out.println(count.getKey());
                }
            }*/

        map.entrySet()
                .stream()
                .filter(entry -> entry.getValue()%2 !=0)
                .forEach(entry -> System.out.println(entry.getKey()));
    }
}
