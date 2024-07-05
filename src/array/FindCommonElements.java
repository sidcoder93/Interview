package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElements {

    public static void main(String[] args) {


        //find the common elements from 3 arrays

        int[] arr1 = {3,5,6,7,8,9};

        int[] arr2 = {2,5,7,10,12};

        int[] arr3 = {5,9,30,34,50};

        //convert to set and find the intersection of 3 sets

        Set<Integer> set1 = new HashSet<>();

        for(Integer num : arr1){
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();

        for(Integer num : arr2){
            set2.add(num);
        }

        Set<Integer> set3 = new HashSet<>();

        for(Integer num : arr3){
            set3.add(num);
        }

        set1.retainAll(set2);

        set1.retainAll(set3);

        System.out.println(Arrays.toString(set1.toArray()));

        anotherAppraoch();
    }

    public static void anotherAppraoch(){


        int[] arr1 = {3,4,6,7};

        int[] arr2 = {2,4,7,10,12};

        int[] arr3 = {2,7,9,30,34,50};


        int i=0; int j=0; int k=0;

        while(i<arr1.length && j<arr2.length && k< arr3.length){

            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){

                System.out.println("Common element is: "+arr1[i]);

                i++;
                j++;
                k++;
            }

            else if (arr1[i] < arr2[j]){

                i++;
            }

            else if (arr2[j] < arr3[k]){

                j++;
            }

            else{

                k++;
            }
        }


    }
}
