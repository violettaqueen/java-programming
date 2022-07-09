package selfPractice.Loops.day15_whileLoop;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "aabcccd";
        char ch = 'c';

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (each == 'c'){
                result ++;

            }
        }
        System.out.println(result);
    }
}
/*
 Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char,
  the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */