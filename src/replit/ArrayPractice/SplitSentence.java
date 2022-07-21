package replit.ArrayPractice;

import utilities.StringUtility;

import java.util.Arrays;

public class SplitSentence {

    public static void main(String[] args) {

        String sentence = "Java is fun";

        String [] sentence1 = {"Java is fun"};

        sentence1 = sentence.split(" ");

        for (String eachWord : sentence1) {
            System.out.println(eachWord);
        }


    }
}
/*
Given a String sentence use the split() method to divide each word from the sentence and print them in separate lines
Hint: Think about what comes between each word in the sentence

Main topics: arrays, String

Example:

Input:
  Java is fun

Output:
  Java
  is
  fun
 */