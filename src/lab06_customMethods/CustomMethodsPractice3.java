package lab06_customMethods;

public class CustomMethodsPractice3 {

    public static void main(String[] args) {

        System.out.println(doubleChar("Cydeo"));



    }

    public static String doubleChar(String str){ //double each char from given string

        String result = ""; // to store new final result

        //1. we need to iterate every single character of the string, create a for loop to iterate start from index 0
        // I will be able to get each character

        for (int i = 0; i < str.length(); i++) {
                        // last index of string
            char each = str.charAt(i); // each character by using i as an index number
            // after getting each character, I will comcate result twice
            result += each;
            result += each;

        }
return result;
    }
}
/*
Question -12
Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerre
 */