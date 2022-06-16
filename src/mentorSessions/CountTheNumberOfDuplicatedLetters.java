package mentorSessions;

public class CountTheNumberOfDuplicatedLetters {


    public static void main(String[] args) {


        // create a string
        String phrase = "How can mirrors be real if our eyes aren't real";


        // stores each characters to a char array

        char[] array = phrase.toCharArray();


        for (int i = 0; i < array.length; i++) {

            // if the array element is a letter
            if (i == 0 || array[i - 1] == ' ') {

                Character.toUpperCase(array[i]);


            }
        }
    }
}













