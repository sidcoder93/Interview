package array;

public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Finding the subarray with the maximum sum
        int maxSum = findMaxSubarraySum(array);

        // Printing the result
        System.out.println("Maximum subarray sum is: " + maxSum);

    }

    public static int findMaxSubarraySum(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max_so_far = Integer.MIN_VALUE;     //stores the maximum sum of contiguous subarray found so far,
        int max_ending_here = 0;     //max_ending_here that stores the maximum sum contiguous subarray ending at current index


        for(int i =0; i<array.length; i++){

            max_ending_here = max_ending_here + array[i];      //-2, 1, -3,

            if(max_ending_here>max_so_far){
                max_so_far = max_ending_here;
            }

            if (max_ending_here<0){
                max_ending_here=0;
            }
        }
        return max_so_far;

    }

}
