package collections.treeset;

import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {

        MyComparator myComparator = new MyComparator();

        TreeSet<Student> treeSet = new TreeSet<>(myComparator);

        treeSet.add(new Student(1, "Sid", 90));
        treeSet.add(new Student(4, "Sid", 95));
        treeSet.add(new Student(2, "Nadal", 80));
        treeSet.add(new Student(3, "Virat", 85));

        treeSet.forEach(System.out::println);

    }
}
