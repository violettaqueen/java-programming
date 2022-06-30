package replit.StringPractice;

public class ReverseStringIf {

    public static void main(String[] args) {

        String word = "viole";
        String reverse = "";

        if (word.length() == 5) {
            for (int i = word.length()-1; i >= 0; i--) {
                char each = word.charAt(i);
                System.out.print(each);
            }

            }else if (word.length() <= 4 ) {
                System.out.println("Too short!");
            } else if (word.length()>5) {
            System.out.println("Too long!");
        }

        }
    }




    

/*
Use String methods and if statements to reverse a String that is five characters long. If the given word is not five characters long,
it will not be reversed. Use the following to output a value:
If the word is less than 5 characters: print Too short!
If the word is more than 5 characters: print Too long!
If the word is 5 characters: print the reversed version of the String. Reading characters from the end to the beginning.
 */