package collections.hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        findElements();

    }



    public static void findElements() {

        int [] arr1 = {1,3,5,6,10};
        int [] arr2 = {1,5,7,8};

        Map<Integer, Integer> countMap = new HashMap<>();


        for(int i =0; i< arr1.length; i++){

            countMap.put(arr1[i], countMap.getOrDefault(arr1[i], 0)+1);
        }

        for(int i =0; i<arr2.length; i++){

            countMap.put(arr2[i], countMap.getOrDefault(arr2[i], 0)+1);
        }

        List<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry: countMap.entrySet()){

            if(entry.getValue()>1){
                list.add(entry.getKey());
            }
        }

        System.out.println(list);
    }


        public static void longestConsecutiveLength () {


        int[] arr = {1,5,3,7,6};   // output -> 3

            //.sort(arr);  //{1,3,5,6,7}

            int currentSeq = 1;
            int maxSequence = 0;

            Set<Integer> set = new HashSet<>();

            for(int n : arr){

                set.add(n);
            }
/*
            for (int num : set){

                while ()

            }*/









        }
}
