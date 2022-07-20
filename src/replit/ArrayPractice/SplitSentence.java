package replit.ArrayPractice;

import utilities.StringUtility;

import java.util.Arrays;

public class SplitSentence {

    public static void main(String[] args) {

        String sentence = "Java is fun";

        String [] sentence1 = {"Java is fun"};

        sentence1 = sentence.split(" ");

        for (String eachWord : sentence1) {
            System.out.println(eachWord);
        }


    }
}
