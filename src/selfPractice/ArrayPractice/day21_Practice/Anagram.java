package selfPractice.ArrayPractice.day21_Practice;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart",
                str2 = "earth";
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);





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