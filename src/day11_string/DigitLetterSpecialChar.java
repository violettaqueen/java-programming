package day11_string;
/*
3. Create a class named DigitLetterSpecialChar and write a program that can
ask the user to enter a word
            - if the word starts with digits, print "first character is
            digit"
            - if the word starts with uppercase letters, print "first
            character is lowercase letter"
            - if the word starts with lowercase letters, print "first
            character is uppercase letter"
            - if the word starts with special characters, print
            "first character is special character"


            HINT: You need to check the ascii table
 */
import java.util.Scanner;
public class DigitLetterSpecialChar {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();

        if(str.length() >= 1){ //if string has at least one character - pre condition

            char firstCharacter = str.charAt(0); //first character of string

            if(firstCharacter >= '0' && firstCharacter <= '9'){
                System.out.println("first character is digit");

            } else if (firstCharacter >= 'A' && firstCharacter <= 'Z') {
                System.out.println("first character is lowercase letter");

            } else if (firstCharacter >= 'a' && firstCharacter <= 'z') {
                System.out.println("first character is special character");
            }

        }else{ //if string is empty
            System.out.println("String is empty");
        }


    }

}
