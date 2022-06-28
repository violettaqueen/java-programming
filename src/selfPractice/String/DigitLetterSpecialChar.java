package selfPractice.String;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String word = input.next();

        char firstDigit = word.charAt(0)

        if (word.charAt(0) ==  ){
            System.out.println("First character id digit");
        } else if (word.charAt(0)) {
            System.out.println("first character is lowercase letter");
        } else if () {
            System.out.println("first character is uppercase letter");
        }else{
            System.out.println("first character is special character");
        }
        input.close();

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