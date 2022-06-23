package replit.ArrayPractice;

import java.util.Arrays;

public class FirstAndLastCharacter {

    public static void main(String[] args) {

        String[] words = {"hello", "why", "by", "apple", "note", "violetta"};
        String first = "";

        for (int i = 0; i < words.length; i++) {

            first += words[i].substring(0, 1) + "" + words[i].charAt(words[i].length() - 1) + "\n";


        }
        System.out.println(first);
    }


}
/*
Given a String [] words print the first and last character of each String element in the array. Print the first and last character in the same line with no spaces.
Note: The loop used in the given code is to dynamically create the String array. You don't need to fully understand this part yet, focus only on having access to an array.
Main topics: arrays, primitive data types, concatenation, index, operators, loops, String

Example:

Input:
  ["hello", "why", "by", "apple" , "note"]

Output:
  ho
  wy
  by
  ae
  ne
 */