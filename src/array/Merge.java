package array;

import java.util.Arrays;

public class Merge {


    public static void main(String[] args) {


        int [] arr1 = {1,2,3,4};
        int [] arr2 = {2,4,6,8};

        int [] arr3 = new int[arr1.length + arr2.length];

        for(int i=0; i<arr1.length; i++){

            arr3[i] = arr1[i];
        }

        for(int i=0; i<arr2.length; i++){

            arr3[arr1.length+i] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        mergeAndSortArray();

    }


    public static void mergeAndSortArray(){

        int [] arr1 = {7,8,9,10};
        int [] arr2 = {2,4,6,8};

        int [] arr3 = new int[arr1.length + arr2.length];


        int i=0,j=0,k=0;

        while(i < arr1.length && j < arr2.length) {

            if (arr1[i] <= arr2[j]) {

                arr3[k] = arr1[i];
                i++;
            } else {

                arr3[k] = arr2[j];
                j++;
            }
            k++;

        }

            while (i < arr1.length){

                arr3[k] = arr1[i];
                i++;
                k++;
            }

            while(j < arr2.length){
                arr3[k] = arr2[j];
                j++;
                k++;
            }




        System.out.println(Arrays.toString(arr3));


    }
}
