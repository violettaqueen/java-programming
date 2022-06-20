package lab_Days.lab06_customMethods;

public class StringUtility {

    //to find any word from any sentence

    public static int frequency(String sentence, String word) {

        int count = 0;

        for (int i = 0; i <= sentence.length() - word.length(); i++) {
            String each = sentence.substring(i, i + word.length());

            if (each.equals(word)) {
                count++;

            }


        }
        return count;

    }

    public static int frequency2(String sentence, String word) {
// return the frequency of the given word of the given sentence
        int count = 0;

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }

    public static String reverse(String word) {
        String result = "";

        // to reverse the order

        for (int i = word.length() - 1; i >= 0; i--) { //iterator should decrease by one
            //i > -1 - variant 2
            char each = word.charAt(i);// character starting from last char to first char
            // System.out.println(each);
            result += each; // comcate to new variable result
        }
        return result;

    }
}

/*
Question 16, lab 6
Palindrome - reverse string
Write a method that accepts a string and returns true if the string is palindrome
 */






