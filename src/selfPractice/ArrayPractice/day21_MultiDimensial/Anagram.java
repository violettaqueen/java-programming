package selfPractice.ArrayPractice.day21_MultiDimensial;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart",  // "aehtr"
                str2 = "earth"; //" aehtr"

        // we do not have a sort method in the string but we have it in arrays

        //String [] a1 = str1.split("");
        //String[] a2 = str2.split("");

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        boolean isAnagram = Arrays.equals(s1,s2);
        System.out.println("isAnagram = " + isAnagram);



    }
}
/*
2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false
 */