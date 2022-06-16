package mentorSessions;

import java.util.ArrayList;

public class JadenCased {

    public static void main(String[] args) {

        String sentence = "How can mirrors be real if our eyes aren't real";

        // solution 1


    }

    public String toJadenCase2(String phrase) {

        if (phrase == null || phrase.isEmpty()) {
            return "";
        }
        // we will store a new phrase
        String result = "";

        //  split the phrase by space,convert to String array
        String[] strings = phrase.split(" ");


        // for each loop (array)
        for (String eachWord : strings) {
            result += (eachWord.charAt(0) + "").toUpperCase() + eachWord.substring(1) + " ";
        }
        return result.trim();
    }

}



/*
Your task is to convert strings to how they would be written by Jaden Smith. The
strings are actual quotes from Jaden Smith, but they are not capitalized in the
same way he originally typed them.
Example:
Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real"
Note that this function should a return empty string for an empty string or null
 */







