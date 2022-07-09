package selfPractice.Loops.day15_whileLoop;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me? Yes/No");
        String yesNo = input.next().toLowerCase();

        while (!(yesNo.equals("yes") || yesNo.equals("no"))) {
            System.err.println("Invalid answer, please re-enter");
            System.out.println("Will you marry me? Yes/No");
            yesNo = input.next().toLowerCase();
        }
        if (yesNo.equals("yes")) {
            System.out.println("Congrats");
        } else {
            System.out.println("Goodbye");
        }

        input.close();
    }
}
/*
 Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the
 user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the
    user enters either yes or no

 */