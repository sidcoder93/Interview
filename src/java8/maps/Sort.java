package java8.maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Sort {

    public static void main(String[] args) {

        //sort map by keys using java8
        Map<String, Integer> map = new HashMap<>();

        map.put("two", 2);
        map.put("one", 1);
        map.put("four", 4);
        map.put("five", 5);

        LinkedHashMap<String, Integer> collect = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(collect);

    }
}
