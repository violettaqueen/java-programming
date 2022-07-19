package day17_customClass;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = ""; // result : a2b1c3d1
        // a b c d
        // 2 1 3 1

        // 1. need to focus on getting frequency of first character, then create a second loop in order to find frequency of every char


        for (int j = 0; j < str.length(); j++) { // this loop has access to all the character

            char ch = str.charAt(j); // a - need to compare first char with every single char one by one
            int frequency = 0; // this variable be contineusly reset, that is why it's in the loop
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) { // if every character of the string is matching with the first character
                    // if this condition become true, this char ch has appeared in the string
                    // everytime when this char ch appeared in the string, increase frequency by 1
                    frequency++;
                }

            }
            if (result.contains(""+ ch)){ // if the character is already included in the result
                continue;     // skip that character
            }
            result += ch + "" + frequency; // concate to empty string, or it will make an addition instead of concatenation


        }
        System.out.println(result);

    }
}
/*
	2. Write a program that can find the frequency of the characters from a string
                Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
 */