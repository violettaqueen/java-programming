package selfPractice.String;

import java.util.Scanner;

public class TwoWordsWithoutFirstLetter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word: ");
        String word1 = input.next();

        System.out.println("Enter second word:");
        String word2 = input.next();

        word1 = word1.substring(1);
        word2 = word2.substring(1);
        String result = word1 + word2;

        System.out.println(result);
    }
}
/*
 Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */