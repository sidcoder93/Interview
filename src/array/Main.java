package array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       int [] arr = {1, 50, -99, 102, 150};
       int target = 100;
       int nearestNum=arr[0];

       int smallest =Math.abs(target-nearestNum);   //99

       for(int i =1; i<arr.length; i++){

           int num = diff(target, arr[i]); //50, 2
           if(smallest>num){
               smallest = num;
               nearestNum = arr[i];
           }
       }

        System.out.println(nearestNum);

       arrangeElements();
       arrangeZeroAtFirst();


    }

    public static int diff(int a, int b){

        if(a-b<0){
            return -(a-b);
        }
        else{
            return a-b;
        }
    }

    public static void arrangeElements(){

        int[] arr = {1,2,0,0,3};

        //output -> {1,2,3,0,0}
        int idx=0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] != 0) {

                arr[idx] = arr[i];
                idx++;
            }

        }

        while (idx < arr.length){

            arr[idx] = 0;

            idx++;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static  void arrangeZeroAtFirst(){

        int[] arr = {0,1,9,8,0,9};

        //output -> {0,0,1,9,8,9};

        int counter = arr.length-1;

        for(int i = arr.length-1; i>=0; i--){

            if(arr[i]>0){
                arr[counter] = arr[i];
                counter--;
            }
        }

        while (counter>=0){

            arr[counter] = 0;
            counter--;
        }

        System.out.println(Arrays.toString(arr));
    }


}
