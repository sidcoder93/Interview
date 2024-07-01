package java8.stringdd;

import java.util.stream.IntStream;

public class AlternateCase {


    public static void main(String[] args) {

        String str = "hello";
        StringBuilder result = new StringBuilder(str.length());
        boolean upper = true; // Flag to alternate case

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (upper) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
            upper = !upper; // Toggle the flag
        }

        System.out.println(result.toString());

        anotherApproch("siddharth vaidya");

        usingJava8("hello");

        changeCase("Hi SiddHarth");




    }


    public static void anotherApproch(String str){


        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){

            if(i%2==0){

                sb = sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {

                sb = sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }

        System.out.println(sb);
    }


    public static void usingJava8(String str){


        StringBuilder sb = new StringBuilder();
        IntStream.range(0, str.length())
                .forEach(i -> {
                    char c = str.charAt(i);

                    if(i%2 == 0) {

                         sb.append(Character.toUpperCase(c));
                    }
                    else {
                        sb.append(Character.toLowerCase(c));
                    }

                });

        System.out.println(sb);

    }


    public static void changeCase(String str){

        StringBuilder sb = new StringBuilder(str.length());

        IntStream.range(0, str.length())
                .forEach(i -> {

                    char c = str.charAt(i);

                    if(Character.isUpperCase(c)){
                        sb.append(Character.toLowerCase(c));
                    }
                    else {
                        sb.append(Character.toUpperCase(c));
                    }
                });


        System.out.println(sb);


    }
}
