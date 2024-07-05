package array.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void conquer(int[] arr, int si, int mi, int ei){

        int i = si;
        int j = mi+1;

        int k =0;

        int[] merged = new int[ei-si+1];

        while(i <= mi && j <= ei){

            if(arr[i] <=   arr[j]){
                merged[k++] = arr[i++];
            }
            else{
                merged[k++] = arr[j++];
            }
        }


        while(i<=mi){
            merged[k++] = arr[i++];
        }

        while(j<=ei){
            merged[k++] = arr[j++];
        }

        for(int a=0, b=si; a <merged.length; a++,b++){

            arr[b] = merged[a];
        }

    }


    public static void divide(int[] arr, int si, int ei){

        if(si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr,mid+1, ei);

        conquer(arr, si, mid, ei);

    }

    public static void main(String[] args) {

        int[] array = {3,1,6,7,2,0,9};

        divide(array, 0, array.length-1);

        System.out.println(Arrays.toString(array));
    }
}
