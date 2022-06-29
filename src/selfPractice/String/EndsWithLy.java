package selfPractice.String;

import java.util.Scanner;

public class EndsWithLy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        input.close();

        if (word.endsWith("ly")){
            System.out.println("really???");
        }else{
            System.out.println("Never mind");
        }



    }
}
/*
ask the user to enter a word. if the word ends with "ly",
 print "really???" ,  otherwise, print "never mind"
 */