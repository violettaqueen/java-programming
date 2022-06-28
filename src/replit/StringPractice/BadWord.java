package replit.StringPractice;

import java.util.Locale;

public class BadWord {

    public static void main(String[] args) {

        String sentence = "I'm dumb for failing the quiz";
        String result = "";
        String word = "cool";

        sentence = sentence.replace("dumb", "cool").toLowerCase();

        System.out.println(sentence);

        }

    }

/*
Use String methods to take the given str, which has a bad word, and change the bad word into something nice. Print the fixed String
Change the bad word dumb into cool
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    You are so dumb

  Output:
    You are so cool
Ex:
  Input:
    I'm dumb for failing the quiz

  Output:
    I'm cool for failing the quiz
 */