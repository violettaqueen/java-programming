package mentor_Sessions;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeStringArray {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();


        String[] arr = {"abc", "car", "ada", "racecar", "cool"};
        // index: 0        1       2       3         4     [i]
        String [] palindrome = {""};

        for (int i = 0; i <= arr.length - 1; i++) {


            for (int j = arr[i].length() - 1; j >= 0; j--) {
                char each  = arr[i].charAt(j);





            }
        }

        // for (int j = each.length() - 1; j >= 0; j--) {
        // palindrome += each.charAt(j);

        // list.addAll(Arrays.asList(each));


    }

}





/*

Write a method that takes in a non-empty array of Strings that will return an ArrayList which consists
of palindromic strings in given array. The input string can be assumed to CONTAIN only Alphabets (both
uppercase and lowercase) and numeric digits.
 */