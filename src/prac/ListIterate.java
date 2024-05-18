package prac;

import java.util.*;

public class ListIterate {


    public static void test(){


        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(6);

        Runnable t1 = () -> {
            //t1 task
            integers.add(2);
            integers.add(5);
        };

        Runnable t2 = () -> {

            // t2 task
            for (Integer i : integers){

                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };



        new Thread(t1).start();
        new Thread(t2).start();



    }

    public static void main(String[] args) {


        //Find duplicate element in an integer array

        int[] arr = {1,2,3,4,3,4};

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i=0; i<arr.length; i++){

            countMap.put(arr[i], countMap.getOrDefault(arr[i],0)+1);

        }

        for (Map.Entry<Integer,Integer> count : countMap.entrySet()){

            if(count.getValue()>1){
                System.out.println("Duplicate Element is :"+ count.getKey());
            }
        }


        test();




    }
}
