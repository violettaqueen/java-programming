package replit.StringPractice;

import java.util.Scanner;

public class HalfTwice {

    public static void main(String[] args) {

        String word = "umkar";

        String word2 = "doctor";

        // 1. find an index number of word at the middle position
        int word2Half = word2.length() / 2 - 1;

        // 2. return it as a character:
        char char2 = word.charAt(word.length() / 2 - 1);

        // 3. find index number of this character:
        int index = word.indexOf(char2);

        // 4. substring from index 0 to index of middle character
        word = word.substring(0, index + 1);


        System.out.println(word);
        System.out.println(word2Half);
    }


}

/*
Use String methods to print the first half of the given word, twice. Find the beginning
half of the String and concatenation it twice.
 */

