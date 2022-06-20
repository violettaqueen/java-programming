package mentor_Sessions;

public class CountTheNumberOfDuplicatedLetters {


    public static void main(String[] args) {

        String str = "aabbcde";
        System.out.println(getNumberOfDuplicates("aabbcde"));


    }

    public static int getNumberOfDuplicates(String str) {

        // convert a string to lowercase
        str = str.toLowerCase();

        // create an empty temporary String value
        String temp = "";

        // create a new string value to store data
        String output = "";

        // getting every character of a String conversion of an array
        for (char ch : str.toCharArray()) {
            // condition if empty string doesn't contain a character
            if (!temp.contains(ch + "")) {
                temp += ch; //add character to an empty string
            } else if (!output.contains(ch + "")) {
                output += ch;
            }
        }

        return output.length();
    }
}















