package prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {

        List<Employee> elist = new ArrayList<>();


        Employee e1 = new Employee("Sid", 30);
        Employee e2 = new Employee("Aayu", 26);
        Employee e3 = new Employee("Xyz", 35);

        elist.add(e1);
        elist.add(e2);
        elist.add(e3);

        elist.forEach(System.out::println);

        System.out.println("--------------");


        List<Employee> sortedEmployees = elist.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        System.out.println(sortedEmployees.toString());




       /* Collections.sort(elist, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                Integer age = o1.getAge();
                Integer age2 = o2.getAge();

                return age.compareTo(age2);

            }
        });*/

     /*   elist.forEach(System.out::println);*/



    }
}
