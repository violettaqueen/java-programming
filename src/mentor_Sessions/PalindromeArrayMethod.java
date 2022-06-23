package mentor_Sessions;

import java.util.ArrayList;

public class PalindromeArrayMethod {

    public static ArrayList<String> isArrayPalindrome2(String[] arr) {

        // create an arraylist object:

        ArrayList<String> palindrome = new ArrayList<>();


        String reverse = "";

        for (String each : arr) {


         if( Palindrome2.isPalindrome(each)){
             palindrome.add(each);
         }

        }
        return palindrome;
    }

    public static void main(String[] args) {


    }
}