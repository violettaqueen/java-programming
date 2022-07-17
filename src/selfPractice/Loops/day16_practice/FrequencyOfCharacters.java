package selfPractice.Loops.day16_practice;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabcccd";
        String result = ""; //a2b1c3d1


        for (int j = 0; j < str.length(); j++) {

            char eachChar = str.charAt(j); // each character from the string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // to find the frequency of each character

                char each = str.charAt(i);

                if (each == eachChar ) {
                    count++;
                }
            }
            if(result.contains("" + eachChar)){
                continue;
            }
            result += eachChar;
            result += count;
        }
        System.out.println(result);
    }
}
/*
 Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for
            all the remaining characters
 */