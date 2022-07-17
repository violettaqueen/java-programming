package selfPractice.Loops.day16_practice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabccdeef";
        String unique = ""; //bdf

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  //'a'
            int count = 0; // represent the frequency of ch

            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);  // each character of string

                if (each == ch) {
                    count++;
                }
            }
                if ( count == 1){
                    unique += ch;
                }
            }

        System.out.println(unique);
    }
}
/*
 Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

                        Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining
             characters to find the frequency.
                        if frequency of a character == 1  =========> unique
 */