package mentor_Sessions;

public class Palindrome2 {

    // radar, racecar, civic -> return true;
    // summer -> return false;




    public static boolean isPalindrome(String word) {

        String reverse = "";

        // Delete spaces:
        word = (word.toLowerCase().replace(" ", ""));


        //reverse word:
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);

        }

        // compare the current word with reverse:

        if (!(word.equals(reverse))) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {

        String word = "race car";

        System.out.println("isPalindrome(word) = " + isPalindrome(word));


    }
}
