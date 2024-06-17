package collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapTest {


    public static void main(String[] args) {


        //convert hashmap to Arraylist

        Map<String, String> map = new HashMap<>();

        map.put("One", "1");
        map.put("Two", "2");
        map.put("Three", "3");


        Set<String> strings = map.keySet();

        Collection<String> values = map.values();

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        ArrayList<Map.Entry<String, String>> listOfEntry = new ArrayList<>(entrySet);

        listOfEntry.forEach(System.out::println);

        countOccurances();

        readOnly();



    }


    public static void countOccurances(){

        String st = "I am Siddharth";

        st = st.replaceAll("\\s", "").toLowerCase();

        st.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println("---------------------------------------------------------\n");


        Stream.of(st.split(""))
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()))
                .forEach((k,v) -> System.out.println(k + " " + v));


    }

    public static void readOnly(){


        Map<String, String> map = new HashMap<>();

        map.put("One", "1");
        map.put("Two", "2");
        map.put("Three", "3");

        Map<String, String> stringStringMap = Collections.unmodifiableMap(map);

        stringStringMap.put("Four", "4");

        System.out.println(map);

        //Collections.singletonList();

    }
}
