package stringstest;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringTest {
    public static void main(String[] args) {


        String s = "Siddharth";

        //Collections.sort();

        //sort in alphabatical order nd count the occurances of each letter

        s= Stream.of(s.toLowerCase().split("")).sorted().collect(Collectors.joining());
        System.out.println(s);

       Stream.of(s.split(""))
               .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
               .forEach((k,v) -> System.out.println(k + " " +v));

       checkIFcharacterPresent('c');



    }

    public static void checkIFcharacterPresent(char c){

        String str = "abcdee";

        boolean b = str.chars()
                .anyMatch(x -> x == c);


        System.out.println(b);


    }
}
