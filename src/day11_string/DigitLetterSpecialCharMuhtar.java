package day11_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DigitLetterSpecialCharMuhtar {

    public static void main(String[] args) {

        String str = new Scanner(System.in).nextLine();

        if (str.length() >= 1) {     //if the string has at least one character

            char firstCharacter = str.charAt(0); //the first char of string

            if (firstCharacter >= 48 && firstCharacter <= 57){
                System.out.println("First character is a digit number");
            } else if (firstCharacter >= 'A' && firstCharacter <= 'Z') {
                System.out.println("first character is uppercase letter");
            } else if (firstCharacter >= 'a' && firstCharacter <= 'z') {
                System.out.println("first character is lowercase letter");
            } else {    // otherwise the string is empty
                System.out.println("String is empty");
            }


        }
    }
}


