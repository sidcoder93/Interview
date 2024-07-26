package collections.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {

        MyComparator myComparator = new MyComparator();

        TreeSet<Student> treeSet = new TreeSet<>(myComparator);

        TreeSet<Student> treeSet1 = new TreeSet<>(Comparator.comparingInt(o -> o.percent));

        treeSet.add(new Student(1, "Sid", 90));
        treeSet.add(new Student(4, "Sid", 95));
        treeSet.add(new Student(2, "Nadal", 80));
        treeSet.add(new Student(3, "Virat", 85));

        treeSet1.add(new Student(1, "Sid", 90));
        treeSet1.add(new Student(4, "Sid", 95));
        treeSet1.add(new Student(2, "Nadal", 80));
        treeSet1.add(new Student(3, "Virat", 85));

        treeSet1.forEach(System.out::println);

    }
}
