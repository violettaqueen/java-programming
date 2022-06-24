package replit.StringPractice;

public class MergeWords {

    public static void main(String[] args) {

        String word1 = "aoka";
        String word2 = "lol";

        String result = "";

        if (word1.length() == word2.length()){
            result += word1.substring(0,1) + word2.substring(0,1);
            result += word1.substring(1,2) + word2.substring(1,2);
            result += word1.substring(2)+ word2.substring(2);
        } else if (word1.length() != word2.length()) {
            result += "cannot merge";
        }

        System.out.println(result);
    }
}
/*
Use String methods and if statements to combine the two given String variables, word1 and word2 together, but only combine
 them if the Strings are only three character long. If either String is not three characters long, do not merge them together
  and instead print cannot merge. If both Strings are three characters long then merge them together in the following format
  and print the merged String:
The Strings will be merged by taking the first character of the first word, then the first character of the second word, then
the second character of the first word, etc...
Hint: Concatenating any type with a String, converts the type to a String
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

Ex:
  Input:
    aok
    lol

  Output:
    alookl

Copied!
Ex:
  Input:
    ear
    pie

  Output:
    epaire
Ex:
  Input:
    java
    wow

  Output:
    cannot merge
 */