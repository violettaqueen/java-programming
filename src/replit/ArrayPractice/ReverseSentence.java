package replit.ArrayPractice;

import java.util.Collections;

public class ReverseSentence {

    public static void main(String[] args) {

        String sentence = "Java is fun";
        String[] sentenceArray = sentence.split(" ");
        String reversedSentence = "";
        for (int i = sentenceArray.length - 1; i >= 0; i--) { // iterate in reverse order
            reversedSentence += sentenceArray[i] + " ";

        }
        System.out.println(reversedSentence);

    }
}
