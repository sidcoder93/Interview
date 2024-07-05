package collections.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {


    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();

        int i=0;

        while(i<10){

            set.add(i);
            i++;
        }

        System.out.println(set);

    }
}
