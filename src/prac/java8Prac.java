package prac;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class java8Prac {

    public static void main(String[] args) {


        List<Student> list = new ArrayList<>();

        list.add(new Student("Abd", 10,"Math", 50.00));
        list.add(new Student("Abc", 11,"Math", 70.00));
        list.add(new Student("Abdv", 12,"Science", 40.00));
        list.add(new Student("Abdvvv", 13,"Commerce", 61.00));
        list.add(new Student("Abdddd", 14,"Physics", 53.00));
        list.add(new Student("Abddfd", 15,"Science", 30.00));
        list.add(new Student("Abdrtr", 16,"Math", 20.00));
        list.add(new Student("Abddfdeee", 17,"Bio", 80.00));
        list.add(new Student("Abddfdrrr", 18,"Math", 90.00));
        list.add(new Student("Abdfdffff", 19,"Math", 75.00));


        Map<Boolean, List<Student>> part = list.stream()
                .collect(Collectors.partitioningBy(student -> student.getPercentage()>60.00));


        for(Map.Entry<Boolean, List<Student>> map : part.entrySet()){

            if(map.getKey()){

                System.out.println("List of student above 60" + map.getValue());
            }

            else {
                System.out.println("List of Student below 60" + map.getValue());
            }
        }


        // name and percent of each student


        Map<String, Integer> collect = list.stream()
                .collect(Collectors.toMap(Student::getName, Student::getId));

        collect.forEach((k,v) -> System.out.println("Name-->" + k + " ID-->" + v)  );


        //top 3 performing students

        list.stream()
                .sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3)
                .forEach(System.out::println);

        //Subjects offered

        list.stream()
                .map(Student::getSubject)
                .distinct()
                .forEach(System.out::println);


        //group students by subject

        Map<String, List<Student>> collect1 = list.stream()
                .collect(Collectors.groupingBy(Student::getSubject));

        collect1.forEach((k,v) -> System.out.println("Subject is "+k + " Student is "+v));


    }



}
