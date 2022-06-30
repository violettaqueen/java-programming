package selfPractice.String;

import java.util.Scanner;

public class LastLetterAndFirstLetter {

    public static void main(String[] args) {

        String word1 = "one";
        String word2 = "eight";

        String result = "";

        int lastIndex = word1.length()-1;
        char lastChar = word1.charAt(lastIndex);

        if (word1.charAt(lastIndex) == word2.charAt(0)) {
            result = word1.substring(0,word1.length() - 1);
        }


        System.out.println(result+word2);


    }
}
/*
Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight

 */