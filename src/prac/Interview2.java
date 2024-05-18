package prac;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview2 {

    public static void main(String[] args) {


        String st = "Hello Sid Hello how Hello How";

        String[] array = st.split(" ");

        List<String> list = new ArrayList<>(List.of(array));


        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((k,v) -> System.out.println(k + "-->" + v));


        System.out.println(getSmallestAndLargest("welcometojava", 3));

    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";


        //welcometojava
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        smallest = s.substring(0, k);
        largest = s.substring(0, k);


        //iterate through all possible subsrtrings of length k

        for(int i=0; i<=s.length()-k; i++){
            String subString = s.substring(i,i+k);
            if(subString.compareTo(smallest)<0){
                smallest = subString;
            }
            if(subString.compareTo(largest) > 0){
                largest = subString;
            }

        }
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


}
