package selfPractice.ArrayPractice.day21_Practice;

import java.util.Arrays;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";

        str = str.trim(); // removes extra spaces in the front and in the end
        // [Hello, world, , , , , , I, , , , , , love, , , , , , Java]

        String[] words = str.split(" ");


        str = "";

        for (String each : words) {
            if (!each.isEmpty()) { // if it's not an empty string, it's a word, so I can add it to an empty string str
                str += each + " ";
            }

        }
        str = str.trim();
        System.out.println(str);
    }
}
/*
1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java
 */