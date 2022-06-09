package replit;

import java.util.Scanner;

public class EachLetter {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        //WRITE YOUR CODE BELOW


        for (int i = 0; i <= word.length() - 1; i++) {  //
            char each = word.charAt(i);
            System.out.println(each);


        }
        System.out.println(reverseWord(word));
    }

    public static String reverseWord(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            char each = word.charAt(i);
            reverse = reverse + each;
        }
        return reverse;
    }
}