package array.sorting;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        int[] arr = {2,6,5,19,1};
        int size = arr.length;

        for(int i=0; i<size; i++){

            for(int j=0; j<size-1-i; j++){

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr [j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
