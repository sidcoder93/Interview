package javaconceptoftheday.java8;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {


        //how to merge two unsorted array int single sorted array

        int[] a1 = {1,5,6,3,2};
        int[] a2 = {2,5,9,1,7};

      int[]  c = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).sorted().distinct().toArray();

        System.out.println("Sorted Array "+ Arrays.toString(c));

        System.out.println("-------------------------------------");

       //How do you get three maximum numbers and three minimum numbers from the given list of integers?

        List<Integer> list = List.of(45, 12, 56, 15, 24, 75, 31, 89);

        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\n");

        list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);



        System.out.println("\n ------ Java 8 program to check if two strings are anagrams or not ---------");

        String s1 = "Race Car";
        String s2 = "CarRace";

     s1 =  Stream.of(s1.replaceAll("\\s", "").split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
     s2 =  Stream.of(s2.replaceAll("\\s", "").split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());

      if(s1.equals(s2)){
          System.out.println("Strings are anagram");
      }
      else{
          System.out.println("Strings are not anagram");
      }


        System.out.println("\n---------Find sum of all digits of a number in Java 8-----------");

        int i = 15623;

        String num = String.valueOf(i);
        String[] split = num.split("");
        int sum=0;

        for(int j=0; j< split.length; j++){
            sum = sum + Integer.parseInt(split[j]);
        }

        System.out.println("Sum is "+ sum);

        System.out.println("\n --------using java8 -------------------");




        IntSummaryStatistics collect = Stream.of(String.valueOf(i).split("")).
                collect(Collectors.summarizingInt(Integer::parseInt));

        System.out.println(collect.getSum());
        System.out.println(collect.getCount());


        System.out.println("\n ------- Given an integer array, find sum and average of all elements?--------");

        int[] a =  {45, 12, 56, 15, 24, 75, 31, 89};

        int arraySum = Arrays.stream(a).sum();

        OptionalDouble average = Arrays.stream(a).average();
        System.out.println(average.getAsDouble());


        System.out.println("\n ----18) Reverse each word of a string using Java 8 streams?-------");

        String str = "Java Concept Of The Day";

        String rev = Stream.of(str.split(" "))
                .map(s -> new StringBuffer(s).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(rev);


        System.out.println("\n  ----How do you find sum of first 10 natural numbers--------");

        System.out.println(IntStream.rangeClosed(1,10).sum());


        System.out.println("\n ----------Reverse an integer array----------");

        int[] array = new int[] {5, 1, 7, 3, 9, 6};


        System.out.println();

        int[] revArr = IntStream.range(1, array.length).map(e -> array[array.length - e]).toArray();

        System.out.println(Arrays.toString(revArr));



        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map.Entry<String, Long> stringLongEntry = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().max(Map.Entry.comparingByValue()).get();

        Optional<String> first = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println("-------------------most Frequent element-----------"+first.get());

        System.out.println("Most Frequent Element : "+stringLongEntry.getKey());

        System.out.println("Count : "+stringLongEntry.getValue());

    }

}
