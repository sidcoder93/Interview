package array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicate {

    public static void main(String[] args) {


        int[] nums = {1,2,2,4,4,5,6};

        Set<Integer> set = new LinkedHashSet<>(nums.length);

        for(int num : nums){

            set.add(num);
        }

        System.out.println(set);


       Iterator<Integer> iterator =  set.iterator();

        int index=0;

        while(iterator.hasNext()){

            nums[index] = iterator.next();
            index++;
        }

        System.out.println(Arrays.toString(nums));



        anotherApproch();

        System.out.println( checkIndex("sadbutsad", "but"));


    }

    public static void anotherApproch(){

        int[] nums = {0,0,1,1,2,3,3,4,5,5};

        int index= 0;

        for(int i=1; i<nums.length; i++){

            if(nums[index] != nums[i]){

                index++;

                nums[index] = nums[i];
            }
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(index+1);
    }


    public static int checkIndex(String haystack, String needle){

       if( !haystack.contains(needle)){

           return -1;
       }

       else{

           int i = haystack.indexOf(needle);

           return i;

       }


    }
}
