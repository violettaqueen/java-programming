package selfPractice.ArrayPractice.day22_Practice;

import java.util.Arrays;

public class RetrieveLettersDigitsSpecChars {

    public static void retrieve(String str) {

        for (int i = 0; i < str.length(); i++) {

            String result = "";

            if (Character.isDigit(str.charAt(i))) {
                result += "";
            } else if (Character.isLetter(str.charAt(i))) {
                result += str.substring(str.charAt(i));
            } else if (!(Character.isLetterOrDigit(str.charAt(i)))) {
                result += str.substring(str.charAt(i));
            }
            System.out.println(result);

        }
    }

    public static void main(String[] args) {

        String str = "Wooden Spoon!";
        String digit = "";
        String letters = "";
        String specChar = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (Character.isDigit(each)) {
                digit += each;
            } else if (Character.isLetter(each)) {
                letters += each;
            } else {
                specChar += each;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digit = " + digit);
        System.out.println("specChar = " + specChar);
    }
}

/*
5. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods
 */