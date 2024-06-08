package interviews.OnlineTest;

public class SecondLargestElement {

    public static void main(String[] args) {


        int[] arr = {8,5,7,1,9,10,15};

        int largest = arr[0];
        int second = arr [0];

        for (int i = 1; i<arr.length; i++){

            if(arr[i]>largest){

                second = largest;
                largest = arr[i];

            }
            else if(arr[i]<largest && arr[i] > second){

                second = arr[i];
            }
        }


        System.out.println("Second Largest :"+ second);
        System.out.println("Largest Number: "+ largest);
    }
}
