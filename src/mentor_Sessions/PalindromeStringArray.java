package mentor_Sessions;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeStringArray {
        public static void main(String[] args) {

                ArrayList<String> palindrome = new ArrayList<>();

                String[] arr = {"abc", "car", "ada", "racecar", "cool"};

            for (int i = 0; i < arr.length; i++) {
                for (int j = arr[i].length() - 1; j >= 0; j--) {
                    System.out.print(arr[i].charAt(j));



                    }
                System.out.println(palindrome);
                }

                       }



        }










        // for (int j = each.length() - 1; j >= 0; j--) {
        // palindrome += each.charAt(j);

        // list.addAll(Arrays.asList(each));






/*

Write a method that takes in a non-empty array of Strings that will return an ArrayList which consists
of palindromic strings in given array. The input string can be assumed to CONTAIN only Alphabets (both
uppercase and lowercase) and numeric digits.
 */