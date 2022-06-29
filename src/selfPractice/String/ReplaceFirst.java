package selfPractice.String;

import java.util.Scanner;

public class ReplaceFirst {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();

        input.close();

        if (word.startsWith("x")){
            word = word.replaceFirst("x", "a");
        }

        System.out.println(word);
    }
}
/*
2. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
	                    Input:
	                        xcodex
	                    Output:
	                        acodex
 */