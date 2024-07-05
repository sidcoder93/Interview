package array;

import java.util.Arrays;

public class MinAbsoluteDiff {

    public static void main(String[] args) {

        //find the minimum absolute difference btw 2 elements in an array

        int[] nums = {-3, -2, 5, 7};    //2

        Arrays.sort(nums);

        //{-100,-27,-25,10,15,20}

        int minDiff = diff(nums[0], nums[1]);

        for(int i=1; i<nums.length-1; i++){

            int diff = diff(nums[i], nums[i+1]);

            if(diff< minDiff){

                minDiff = diff;
            }
        }

        System.out.println(minDiff);


    }


    public static int diff(int a, int b){

        if(a>=0 && b>=0){
            return Math.abs(a-b);
        }
        else if(a<0 && b>0){
            return b-a;
        }
        else{
            return Math.abs(-a+b);
        }
    }
}
