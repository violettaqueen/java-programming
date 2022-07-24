package selfPractice.ArrayPractice.day20_ArrayPractice;

import java.util.Arrays;

public class ReverseTheSecondWord {

    public static void main(String[] args) {

        String sentence = "I love Java";

        String[] sentenceArray = sentence.split(" ");

        String result = "";

        for (int i = 0; i < sentenceArray.length; i++) {

            if(i == 1){
                String word = sentenceArray[i];
                for (int j = word.length()-1; j >= 0 ; j--) {
                    result += word.charAt(j);
                }
                result += " ";
            }else{
                result += sentenceArray[i] + " ";
            }
        }
        System.out.println(result);
    }

}
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";
            output:
                I evoL Java
 */
