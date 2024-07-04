package array;

public class FindNthLargestNumber {

    public static void main(String[] args) {


        //find nth largest number from an array

        //partially execute bubble sort till we get nth largets number

        int n = 5;

        int[] arr = {5,8,4,6,2,1};  //output=5

        int size = arr.length;

        for(int i=0; i<n; i++){

            for(int j=0; j<size-1-i; j++){

                if(arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]= temp;

                }
            }
        }

        System.out.println(n+ "th largest number is: " + arr[size-n]);


    }


}
