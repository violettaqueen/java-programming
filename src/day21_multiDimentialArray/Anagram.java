package day21_multiDimentialArray;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        System.out.println(Arrays.toString(a1));

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println(Arrays.toString(a1));

        boolean isAnagram = Arrays.equals(a1, a2);
        System.out.println(isAnagram);
    }

}
/*
Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)
            Ex: str1 = "heart"
            	str2 = "earth"
            output:
            	true
        		str1 = "java"
        		str2 = "python"
    		output:
    			false

 */