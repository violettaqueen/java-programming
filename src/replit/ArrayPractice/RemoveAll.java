package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {

    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi", "hey", "hi", "yo"));
        String targetWord = "hi";

        for (int i = 0; i < wordList.size(); i++) {
            if(wordList.get(i).equals(targetWord)){
                wordList.remove(targetWord);
            }
        }
        System.out.println(wordList);
        }


    }

