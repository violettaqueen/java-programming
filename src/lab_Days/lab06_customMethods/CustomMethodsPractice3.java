package lab_Days.lab06_customMethods;

public class CustomMethodsPractice3 {

    public static void main(String[] args) {

        System.out.println(doubleChar("Cydeo"));

        System.out.println(endsLy("Cydeo"));

        System.out.println(hasBad("xbadxxx"));

        System.out.println(atFirst("v"));

        System.out.println(isPalindrome("racecar"));


    }

    public static String doubleChar(String str) { //double each char from given string

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

    public static boolean endsLy(String str) {

        // to check if string ends with ly, use endsWith()
        return str.endsWith("ly");
    }

    public static boolean hasBad(String str) {

        // create a substring that contain 3 characters of a given string
        if (str.equals("bad")) {
            return true;
        }

        if (str.length() < 4) { //if total number of characters in the string less the 4 characters, then check if the first
            // 3 characters equals to bad otherwise we return false
            return false;
        }
        if (str.substring(0, 3).equals("bad")) { // that's how we get first 3 characters, first substring start from index 0 to index 3
            return true;
        }
        if (str.substring(1, 4).equals("bad")) { // second substring start from index 1 to index 4. we have to include index 4 because it will be excluded
            // we need to make sure that string has at least 4 characters
            return true;
        }
        return false;


    }

    public static String atFirst(String str) {

        String result = "";
// 1. check if string has enough length
        if (str.isEmpty()) {
            return "@@";
        } else if (str.length() == 1) {
            return str + "@";
        }// return first two characters
        return str.substring(0, 2); // in order to include index 1, we need to include index 2
    }

    public static boolean isPalindrome(String str){

       return StringUtility.reverse(str).equalsIgnoreCase(str);
       // compare with original string for case sensativity
    }
}
/*
Question -12
Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerre

Question - 13
Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

Question -14
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false

Question -15
Given a string, return a string length 2 made of its first 2 chars. If the string
length is less than 2, use '@' for the missing chars.
atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"

Question -16
Palindrome - reverse string
Write a method that accepts a string and returns true if the string is palindrome

 */