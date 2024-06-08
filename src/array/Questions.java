package array;

import java.util.*;
import java.util.stream.Collectors;

public class Questions {

    public static void main(String[] args) {

        question1();
        question2();
        question3();

    }

    /**
     * Find 2nd Largest element in an array
     */
    public static void question1() {

        int[] arr = {12, 1, 23, 56, 25, 16, 55, 1};
        int largest = arr[0];
        int secondLargest = arr[1];

        if (arr[1] > arr[0]) {

            largest = arr[1];
            secondLargest = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
    /*
    find the equality of 2 arrays
     */
    public static void question2(){


        int[] arr = {1,2,3,4,5};
        int[] arr1 = {5,2,4,3,1};

        Arrays.sort(arr);
        Arrays.sort(arr1);

        boolean equal = true;

        for(int i= 0; i<arr.length; i++){

           if(arr[i] != arr1[i]){
               equal = false;

           }
        }

        if(equal){
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }


        List<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println(list1.equals(list2));

    }

    /*
      Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?
     */

     public static void question3(){

         int[] arr = {1,3,4,6,7,8,9,10};

         int sum = 10;

         //sort array

         Arrays.sort(arr);

         int i = 0;
         int j = arr.length-1;

         while(i<j){

             if(arr[i] + arr[j] == sum){

                 System.out.println("Pair is " + arr[i] + " and " + arr[j] + " = " +sum);

                 i++;
                 j--;
             }

              else if (arr[i] + arr[j] > sum){

                 j--;
             }

            else if (arr[i] + arr[j] < sum){

                  i++;
              }
         }

     }


}
