package selfPractice.String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = input.next();

        input.close();

        word = word.replace("x", "a").replace("X", "a");

        System.out.println(word);
    }
}
/*
 Write a program that asks user to enter a word. and replace all the x or X with character a
	                    Input:
	                        xcodeX
	                    Output:
	                        acodea
 */