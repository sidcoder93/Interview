package interviews.OnlineTest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveArray {

    /*
    find the longest consecutive sequence
    input -> {100,2,9,3,4}
    output -> 3 ({2,3,4})
     */

    public static void main(String[] args) {


        //convert to set
        int [] arr = {100,28,7,3,4,5,16,17};

        Set<Integer> set = new TreeSet<>();

        for(int num : arr){

            set.add(num);
        }

        //for each element in array, check if its start of sequence, if it is start count the length of
        //consecutive length of sequence from that element
        int longestSeq=0;
        for(int nums : set){

            if(!set.contains(nums-1)) {

                int currentNum = nums;
                int currentStreak = 1;


                while (set.contains(currentNum + 1)) {

                    currentNum += 1;
                    currentStreak += 1;
                }

                longestSeq = Math.max(longestSeq, currentStreak);

            }



        }

        System.out.println("----------------------");

        System.out.println(longestSeq);


    }




}
