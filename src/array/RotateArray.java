package array;

import java.util.Arrays;

public class RotateArray {


    public static void rotateArray(int[] arr, int start, int end){

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {




        int [] arr = {1,2,3,4,5,6,7};
        int k = 2;
        //output -> {6,7,1,2,3,4,5,}

        /*
        reverse the array -> 7,6,5,4,3,2,1
        reverse first 2 and reverse last 5 -> 6,7, 1,2,3,4,5
         */
        int length = arr.length;

        for(int i=0; i<length/2; i++){

            int temp = arr[i];
            arr[i] = arr[length-1-i];
            arr[length-1-i]= temp;
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<k; i++){
            int temp = arr[i];
            arr[i] = arr[k-1];
            arr[k-1] = temp;
        }
        int newLength = length-k;
        int count=0;

        for (int i=k; i < newLength ; i++){

            int temp = arr[i];   //5
            arr[i] = arr[length-1-count];  //
            arr[length-1-count]= temp;
            count++;
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Final Array : "+Arrays.toString(arr));

        System.out.println("---------------------------");

        int[] newArr = {1,2,3,4,5,6,7};

        rotateArray(newArr, 0, newArr.length-1);
        rotateArray(newArr, 0, 1);
        rotateArray(newArr, 2, newArr.length-1);

        System.out.println("NEW OUTPUT :" + Arrays.toString(newArr));



    }



}
