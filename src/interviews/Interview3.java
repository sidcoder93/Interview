package interviews;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @LTIMindTree
 * @Capgemini
 */
public class Interview3 {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        map.put(5, 7);
        map.put(6, 7);
        map.put(7, 7);
        map.put(8, 5);
        map.put(9, 5);

        System.out.println("-----------");

       map.entrySet()
               .stream()
               .sorted(Comparator.comparingInt(Map.Entry::getKey))
               .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new))
               .forEach((k,v) -> System.out.println(k + " " +v));

        System.out.println("------------");

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

        int a = 5;

        String s = a + "";
        System.out.println(s);

        List<Integer> list = Arrays.asList(1, 5, 12, 34, 17);

        list.stream()
                .map(String::valueOf)
                .filter(x -> x.startsWith("1"))
                .collect(Collectors.toList())
                .forEach(System.out::println);



        sortInAlphabaticalOrder();
        hashMapQuestion();
        findNearestNumber(100);

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


        public void ArrayToListConvert(){


                int[] arr = {1,2,3,4,5,6};

            List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));

            String [] array = {"JAVA", "Spring", "SpringBoot"};

            List<String> list1 = Arrays.asList(array);


        }

        public static void ListToArray(){


            List<Integer> integers = List.of(1, 2, 3, 4, 5);

            int[] array = integers.stream().mapToInt(Integer::intValue).toArray();

            List<String> spring = List.of("Spring", "java");

            String[] array1 = spring.toArray(new String[spring.size()]);


        }

        public static void sortInAlphabaticalOrder(){

        String s = "Siddharth";

            System.out.println(s);

            char[] charArray = s.toLowerCase().toCharArray();
            Arrays.sort(charArray);

            String sorted = new String(charArray);
            System.out.println(sorted);

            String collect = Stream.of(s.toLowerCase().split("")).sorted().collect(Collectors.joining());
            System.out.println(collect);

        }


        public static void hashMapQuestion(){

        String s = "Hello Hi Hello Hi How Are You Hello";

                Stream.of(s.split(" "))
                        .collect(Collectors.groupingBy(Function.identity(),  LinkedHashMap::new, Collectors.counting()))
                        .forEach((k,v) -> System.out.println(k + " " +v));

        }


        public static void findNearestNumber(int n){


            int [] arr = {1,10,95,-100,80,101};

            int nearest = arr[0];
            int difference = difference(n,nearest);

            for(int i=1; i<arr.length; i++){

                int diff = difference(n, arr[i]);

                if(diff<difference){
                    difference= diff;
                    nearest = arr[i];
                }
            }

            System.out.println(nearest);

    }


    public static int difference(int target, int n){

        if(n<0){
            return target+n;
        }
        else return Math.abs(target-n);

    }








}
