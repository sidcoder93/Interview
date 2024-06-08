package prac;

import com.sun.security.jgss.GSSUtil;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringPractice {


    public static void main(String[] args) {

        String str = "abc";
        String str2 = "abc";
        String str1 = new String("abc");
        str.concat("xyz");
        System.out.println(str == str1);      // it will compare the address of the object
        System.out.println( str == str2);  // true
        System.out.println(str.equals(str1));   // it will compare the contents of the Stiring



        countNoOfWordsInString("Strings in Java");
        countCharacters("Java is Java", 'a');
        reverseString("siddharth");
        checkAnagram("Mother In Lawwwww", "Hitler Woman");

        maxOccuringChac("Java Concept of the day");

        testBuilder();

    }
    public static void countNoOfWordsInString(String str) {

        int count =1;

        System.out.println(str.length());

        for(int i = 0; i< str.length()-1 ; i++){

            if(str.charAt(i) == ' '  &&  str.charAt(i+1)!= ' '){
                count++;

            }
        }

        System.out.println("No of words in String is  "+count);
    }


    /**
     * Count the occurance of a character in String without using any loop
     *
     */
    
    public static void countCharacters(String str,  char c) {

        String newString =  str.replace(String.valueOf(c), "");
        System.out.println(newString);
        int count = str.length() - newString.length();
        System.out.println("Count is " +count);

        Map<Character, Long> countMap = str.chars()
                .mapToObj(b -> (char) b)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("count is "+ countMap.get(c));

    }


    public static void reverseString(String str){


       char[] c =  str.toCharArray();
       StringBuilder rev= new StringBuilder();

       for (int i=c.length-1; i>=0; i--){

           rev.append(c[i]);
       }

        System.out.println(rev);
    }


    /**
     * Check if strings are Anagram
     */
   // String s1 = "Mother In Law";
   // String s2 = "Hitler Woman";
   static void checkAnagram(String s1, String s2){

       //remove white spaces

       String c1 = s1.replaceAll("\\s", "");
       String c2 = s2.replaceAll("\\s", "");

       //check length of Strings are same

       if(c1.length() == c2.length()) {

           //covert to char array with lower case
           char[] array1 = c1.toLowerCase().toCharArray();
           char[] array2 = c2.toLowerCase().toCharArray();

           //sort array
           Arrays.sort(array1);
           Arrays.sort(array2);

           //check equality of both array
           if (Arrays.equals(array1, array2)) {

               System.out.println(s1 + " and " + s2 + " are Anagram Strings");
           } else {
               System.out.println(s1 + " and " + s2 + " are not Anagram Strings");
           }
       }else{
           System.out.println(s1 + " and " + s2 + " are not Anagram Strings");

       }


   }

    /**
     * Find Max count of the character in a String
     * @param st
     */

   static void maxOccuringChac(String st){


       Map.Entry<Character, Long> characterLongEntry = st.replaceAll("\\s", "")
               .chars()
               .mapToObj(c -> (char) c)
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
               .entrySet()
               .stream().max(Comparator.comparingLong(Map.Entry::getValue))
               .get();

       System.out.println("Max count of char " + characterLongEntry.getKey() + " :" + characterLongEntry.getValue());


   }

   static void testBuilder(){

       StringBuilder sb = new StringBuilder("Siddharth");

       StringBuilder sb1 = new StringBuilder("Siddharth");
       sb1.append("Vaidya");

       System.out.println(sb1.compareTo(sb));
   }


}
