package hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        map.put(5, 7);
        map.put(6, 7);
        map.put(7, 7);
        map.put(8, 5);
        map.put(9, 5);


        //need output as <7,[5,6,7]> <5, [8,9]>

        Map<Integer, List<Integer>> output = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            Integer value = entry.getValue();
            Integer key = entry.getKey();
            if (!output.containsKey(value)) {
                output.put(value, new ArrayList<>());
            }
            output.get(value).add(key);
        }

        System.out.println(output);
        q1();
        q2();

    }


    public static void q1() {


        //sort map by keys

        Map<String, String> map = new HashMap<>();

        map.put("Siddharth", "Vaidya");
        map.put("Roger", "Federer");
        map.put("Virat", "Kohli");


        //sort by keys

        LinkedHashMap<String, String> collect = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        collect.forEach((k, v) -> System.out.println(k + v));

    }


        public static void q2() {

            //sort by values

            Map<String, String> names = new HashMap<>();

            names.put("Siddharth", "Vaidya");
            names.put("Roger", "Federer");
            names.put("Virat", "Kohli");


            names.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new))
                    .forEach((k, v) -> System.out.println(k + v));


        }





}
