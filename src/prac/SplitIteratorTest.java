package prac;

import java.util.List;
import java.util.Spliterator;

public class SplitIteratorTest {



    public static void main(String[] args) {

        List<String> listLang = List.of("Java", "C", "C++", "Python", "php");

       Spliterator<String> splitIterartor =  listLang.spliterator();

        Spliterator<String> stringSpliterator = splitIterartor.trySplit();

        System.out.println("----From 1st Iterator---");
        splitIterartor.forEachRemaining(System.out::println);

        System.out.println("\n-----From 2nd Iterator-----");
        stringSpliterator.forEachRemaining(System.out::println);




    }
}
