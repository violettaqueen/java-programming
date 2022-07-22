package replit.ArrayPractice;

import java.util.Collections;

public class ReverseSentence {

    public static void main(String[] args) {

        String sentence = "Java is fun";

        String[] sentenceArray = {"Java is fun"}; // convert String object to an array object

        sentenceArray = sentence.split(" "); // split array into an array of Strings

        for (int i = sentenceArray.length-1; i >= 0; i--) { // iterate in reverse order
            System.out.print(sentenceArray[i].trim() + " ");
        }


    }
}
