package stringstest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

public class ChangeCase {


    public static void main(String[] args) {

        Optional<String> optional = Optional.ofNullable(null);
        String result = optional.orElse("defualt");
        System.out.println(result);
       // System.out.println(changeCaseOfString("AbcDE"));
        char c = 'A';
        System.out.println(c++);
        System.out.println(++c);

        arrangeArray();

    }


    public static String changeCaseOfString(String str){

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){

            if(Character.isUpperCase(str.charAt(i))){
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
            else {
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }

        return sb.toString();
    }


    public static void arrangeArray(){

        int[] arr = {5,6,7,8,9,10,11};
        //output -> {6,5,8,7,10,9,11}


        int index =0;

        while(index< arr.length-1){

            int temp = arr[index+1];   //6, 8
            arr[index+1] = arr[index]; //5, 7
            arr[index] = temp;  //6,5,8,7,
            index= index+2;
        }

        System.out.println(Arrays.toString(arr));


    }



}
