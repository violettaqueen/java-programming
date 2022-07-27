package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {

    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi", "hey", "hi", "yo"));

        String targetWord = "hi";
        removeAll(wordList, "hi");
        System.out.println(wordList);
        }
    public static ArrayList<String> removeAll(ArrayList<String>wordList, String targetWord){

       wordList.removeAll(Arrays.asList(targetWord));

        return wordList;
    }

    }

