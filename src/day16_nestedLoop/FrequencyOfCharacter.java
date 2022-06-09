package day16_nestedLoop;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "aabbbcccc"; // how many char appeared in a string
        char ch = 'c';
        // 1. create a variable that contain result in the end
        int count = 0;

        // get all the characters in the string

        for (int i = 0; i < str.length(); i++) {
                          // it includes last char -1, i : index numbers of str
            if(str.charAt(i) == ch){
        count++;
        }

    }

    }
}
/*
 2. write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */