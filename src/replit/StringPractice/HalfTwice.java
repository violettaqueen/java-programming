package replit.StringPractice;

import java.util.Scanner;

public class HalfTwice {

    public static void main(String[] args) {

        String word = "umkar";



         char char2 = word.charAt(word.length() / 2 - 1);

         int index = word.indexOf(char2);

        word = word.substring(0, index+1);



        System.out.println(word);
    }


}

/*
Use String methods to print the first half of the given word, twice. Find the beginning
half of the String and concatenation it twice.
 */

