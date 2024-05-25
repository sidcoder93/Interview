package array;

import java.util.Arrays;

public class ProductOfArray {

    public static void main(String[] args) {

        //[1,3,4,2] --> [24,8,6,12]

        int[] arr = {1,3,4,2};
        int product=1;

        for(int i=0; i<arr.length-1;i++){

            for (int j=i+1; j<arr.length; j++){
                product = product*arr[j];
                if(i>0)
                for (int k = i-1; k>0; k--){
                    product = product*arr[k];
                }
                arr[i] = product;
            }
            product=1;
        }
        System.out.println(Arrays.toString(arr));


    }
}
