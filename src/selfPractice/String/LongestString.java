package selfPractice.String;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two words:");
        String word1 = input.next();
        String word2 = input.next();

        if (word1.length() > word2.length()){
            System.out.println(word1 + " is the longest string");
        } else if (word2.length() > word1.length()) {
            System.out.println(word2 + " is the longest string");
        }else{
            System.out.println("Equal");
        }

        input.close();


    }
}
/*
  1. Create a class named LongestString
            1.1 Ask the user to enter two strings
            1.2 Write a program that can print the longest string, if both have the same number of characters then print "Equal"


 */