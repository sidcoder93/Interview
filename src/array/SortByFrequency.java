package array;

import java.util.*;
import java.util.stream.Collectors;

public class SortByFrequency {

    public static void main(String[] args) {

        //{7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3}   --> {1,1,1,1,7,7,7,3,3,4,4,5,9}

        sort(new int[]{7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3});
    }



    public static void sort(int[] nums){

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){

            map.put(num, map.getOrDefault(num,0)+1);
        }
        LinkedHashMap<Integer, Integer> collect = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : collect.entrySet()){

            int key = entry.getKey();
            int value = entry.getValue();
            int count=0;
            while(count<value){
                list.add(key);
                count++;
            }

        }


        System.out.println(list);




    }
}
