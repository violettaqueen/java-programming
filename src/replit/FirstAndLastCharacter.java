package replit;

import java.util.Scanner;

public class FirstAndLastCharacter {

    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        "Queen".length();
        String firstLetter = word.charAt(0)+ "";
        System.out.println("first letter: " + firstLetter);

        String lastLetter = word.charAt(word.length()-1)+"";
        System.out.println("last letter: " + lastLetter);

    }
}


