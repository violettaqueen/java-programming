package replit.ArrayPractice;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShortestWords {

    public static void main(String[] args) {

        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

        String[] array = str.split(" ,");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(Arrays.toString(array));


        //  dogs2 = list.toArray(new Dog[list.size()]);
        String shortest = "";



    }
}
/*
Given a String str, find and print the shortest words. The String will have multiple words separated by commas and spaces.
 If there is words that have the same length, they should all be displayed at the end. Print all the shortest words in the following
  format:
Input: word1, word2, word3, word4, etc...

Output: [short1, short2, short3, etc...]

Hint: Think about what comes between each word in the sentence

Main topics: arrays, String, loops, if statements, primitive datatypes, operators

Example:

Input:
  olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

Output:
  [old, cat, ray]
 */