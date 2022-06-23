package mentor_Sessions;

import java.util.ArrayList;

public class PalindromeStringArrayMethod {

    public static ArrayList<String> isArrayPalindrome2(String[] arr) {

        // create an arraylist object:

        ArrayList<String> palindrome = new ArrayList<>();

        //check each element in the array
        String reverse = ""; // each time created new string

        for (String each : arr) {

            reverse = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }
            if (reverse.equals(each)) {
                palindrome.add(each);
            }

        }
        return palindrome;


    }

    public static void main(String[] args) {

        String[] arr = {"abc", "car", "ada", "racecar", "cool"};

        System.out.println((isArrayPalindrome2(arr)));

    }
}

/*

Write a method that takes in a non-empty array of Strings that will return an ArrayList which consists
of palindromic strings in given array. The input string can be assumed to CONTAIN only Alphabets (both
uppercase and lowercase) and numeric digits.
 */