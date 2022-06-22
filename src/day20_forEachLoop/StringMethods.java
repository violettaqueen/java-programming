package day20_forEachLoop;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.toCharArray(); //char[] ch = str.replace(" ", ""). toCharArray(); to remove spaces

        System.out.println(Arrays.toString(ch));

        System.out.println("------------------------------------------------------------------------------");

        String str2 = "Today is a great day to learn Java"; //to get every word from string one by one

        String[] words = str2.split(" "); // String[] words = str2.split("great"); "great" is not included

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------------------------------------------------------");

        String sentence = "I love java"; // reverse to : "java love I"

         // array contains [I, love, java]

        String[] arr = ArraysUtility.reverse(sentence.split(" "));// array contains [I, love, java]

        System.out.println(Arrays.toString(arr));

        String reversedSentence = ""; //"Java love I"

        for (int i = arr.length-1; i >= 0; i--) {
            reversedSentence += arr[i] + " ";

        }
        System.out.println(reversedSentence);



    }

}
