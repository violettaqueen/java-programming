package replit.StringPractice;

public class MiddleCharacter {

    public static void main(String[] args) {

        String word = "lizzy";

        String result = "";


        if(word.length() % 2 == 0){
            result += "" + word.charAt(word.length()/2 -1);
            result += "" + word.charAt(word.length()/2);
        } else if (word.length() %2 != 0) {
            result += "" + word.charAt(word.length()/2);
        }
        System.out.println(result);
    }

    }

/*
Use String methods and if statements to find the middle character/s of the given word variable. The value of the word will be
input from a Scanner, but you only need to interact with the String variable. Output in the following format:
Note: Odd length words will have one middle character, but even length words will have two middle character, so use the length
 of the Strings to determine what the output should be.
Main topics: String manipulation, Scanner, methods, primitive data types, concatenation, if statements, operators
 */