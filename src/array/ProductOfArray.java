package array;

import java.util.Arrays;

public class ProductOfArray {

    public static void main(String[] args) {

        //[1,3,4,2] --> [24,8,6,12]

       int[] nums = {1,3,4,2};
       int[] productNum = new int[nums.length];//output->{24,8,6,12}

       for(int i=0; i<nums.length; i++){

           //right index product
           int rightProduct=1;
           int leftProduct=1;
           for(int j=i+1; j<nums.length; j++){

               rightProduct = rightProduct*nums[j];
           }
           for(int j=i-1; j>=0; j--){

               leftProduct = leftProduct*nums[j];
           }

           productNum[i] = leftProduct*rightProduct;

       }

        System.out.println(Arrays.toString(productNum));




    }
}
