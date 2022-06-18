package selfPractice;

import java.util.Scanner;

public class GuestList {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int guestCount = 0;
        //WRITE YOUR CODE BELOW
        System.out.println("Please enter the guest's name: ");
        String guestList = input.next();
        guestCount++;

        String answer = "answer";
        String answerYes = "yes";
        String answerNo = "no";


        while (answer.equals("yes")) {
            System.out.println("Do you want to enter another guest's name?");
            answer = input.next();
        }
        System.out.println("Please enter the guest's name: ");
        input.next();


        System.out.println("Guests' list: " + guestList);


    }
}




