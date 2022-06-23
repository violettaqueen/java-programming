package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        ArrayList<String> reverse = new ArrayList<>();

        String[] words = {"hello", "why", "by", "apple", "note"};


        for (int i = words.length - 1; i >= 0; i--) {
           reverse.add(words[i]);
        }
        System.out.println(reverse);

            }

        }



/*
Given a String [] words, go through the array and reverse it. Print the reversed array where the order of the elements is changed.
Note: The loop used in the given code is to dynamically create the string array. You don't need to fully understand this part yet, focus only on having access to an array.
Main topics: arrays, primitive data types, concatenation, index, operators, loops, String

Example:

Input:
  [hello, why, by, apple, note]

Output:
  [note, apple, by, why, hello]
 */