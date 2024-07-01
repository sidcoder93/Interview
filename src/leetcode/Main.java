package leetcode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};  //0,1,3,0,4

        System.out.println(removeElement(nums, 2));

    }

    public static int removeElement(int[] nums, int val) {

        int index = 0;
        int size = nums.length;

        for (int i = 0; i < size; i++) {

            if (nums[i] != val) {

                nums[index] = nums[i];
                index++;
            }
        }

        for(int i= index; i<size; i++){

            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));

        return index;

    }
}
