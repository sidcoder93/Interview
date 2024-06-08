package contract;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Sid", 1);
        Student s2 = new Student("Sid", 2);

        Student s3 = new Student("Sid", 1);


        Map<Student, Integer> map =  new HashMap<>();

        map.put(s1,1);
        map.put(s2,2);
        map.put(s1,3);
        System.out.println(s1.equals(s2));
        System.out.println(map.size());

        System.out.println(map.get(s2));


    }
}
