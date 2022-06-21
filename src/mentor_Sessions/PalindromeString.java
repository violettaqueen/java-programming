package mentor_Sessions;

public class PalindromeString {
    public static void main(String[] args) {

        System.out.println(palindrome("volk3"));
    }


    public static boolean palindrome(String word) {

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);

            if (!word.toLowerCase().contains(reverse)) {
                return false;
            }
        }
        return true;


    }
}




















/*
write the method that accepts a String as an Argument and return true if it's a palindrome, or false otherwise.
Assume that string has only alphanumeric characters include letters and numbers and spaces, ignore upper-lowerCase characters
 */