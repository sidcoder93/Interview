package collections;

import java.util.*;

public class TreeSetTest {


    public static void main(String[] args) {

        treeSetPrac();

    }


    public static void treeSetPrac(){

        TreeSet<Integer> treeSet = new TreeSet<>((o1, o2) -> o2-o1);

        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(1);

        System.out.println(treeSet);

        Map<String, String> hasmap = new HashMap<>();

        hasmap.put("1", "One");
        hasmap.put("2", "TWO");

       Iterator<Map.Entry<String, String>> it =  hasmap.entrySet().iterator();

       while(it.hasNext()){
           String key = it.next().getKey();

           System.out.println(key + " " + hasmap.get(key));
       }



    }


}
