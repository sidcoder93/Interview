package java8.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class TestMethod {


    public static void main(String[] args) {

        Map<String, List<String>> fx = new HashMap<>();

        fx.put("ASIA", List.of("TOKYO", "INDIA"));
        fx.put("LONDON", List.of("LONDON_SPV", "GERMANY"));

        Map<String, List<String>> hashMap = new HashMap<>();

        hashMap.put("TOKYO", List.of("0841"));
        hashMap.put("GERMANY", List.of("0891", "9091", "8081"));
        hashMap.put("LONDON_SPV" , List.of("5455", "9899", "0900"));




    }
}
