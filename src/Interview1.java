import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Interview1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Siddharth");
        list.add("Vaidya");
        list.add("Siddharth");

        System.out.println(list);

        list.stream()
                .distinct()
                .forEach(System.out::println);



           Map<String, Long> countMap =     list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

           countMap.forEach((k,v) -> System.out.println("Name " +k + " count " + v));



           String s1 = "abcd";

           String s2 = "cdab";

           //abcdcdab


        // --------------- check if String S1 contains String S2 --------------

           if((s1+s2).indexOf(s2) != -1){

               System.out.println("S1 contains s2" + true);
           }

           if(s1.length() == s2.length() &&  (s1+s1).contains(s2)){

               //abcdabcd


           }


           int i = 5;
           int j = 4;

           i = i+j;  //9
           j = i-j;// 5
          i= i-j; //4

        System.out.println();


        Integer integer = 1000;

        String s = String.valueOf(1000);

        Map<Character, Long> collect = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((k,v) -> System.out.println(k + "-" +v));

        test();

        System.out.println(List.of("MM").containsAll(Arrays.asList("MM")));


        IntStream.of(1,1,3,3,7,6,7)
                .distinct()
                .parallel()
                .map(a -> a*2)
                .sequential()
                .forEach(System.out::print);


    }

    public static void test(){

        int i = 1;
        i++;

        inc(i);
        System.out.println("i = " +i);


    }

    public static void inc(int i){
        i = i+2;
    }

    public static void test1(){

        int result , x;

        x=1;
        result=0;

        if(x<=10){


        }
    }
    }

