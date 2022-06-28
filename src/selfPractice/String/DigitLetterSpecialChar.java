package selfPractice.String;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String word = input.next();

        input.close();

        // 1. Should check a length of a string in order to get a first character because what if it's an empty string
        // 2. 4 conditions to create:

        if (word.length() >= 1) {
            char first = word.charAt(0);

            if (first >= 48 && first <= 57) {  // first >= '0' && first <= '9'
                System.out.println("First character id digit");
            } else if (first >= 'A' && first <= 'Z') {
                System.out.println("first character is uppercase letter");
            } else if (first >= 'a' && first <= 'z') {
                System.out.println("first character is lowercase letter");
            } else {
                System.out.println("first character is special character");
            }

            }else {
                System.out.println("Word is empty");
            }



        }
    }

/*
 Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
            - if the word starts with digits, print "first character is digit"
            - if the word starts with uppercase letters, print "first character is lowercase letter"
            - if the word starts with lowercase letters, print "first character is uppercase letter"
            - if the word starts with special characters, print "first character is special character"


            HINT: You need to check the ascii table

 */