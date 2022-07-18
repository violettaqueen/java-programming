package selfPractice.Loops.day16_practice;

import java.util.Scanner;

public class RoomReservation2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;

        while(true) {

            System.out.println("Which room would you like to select?");
            System.out.println("\t\tKing Bed == $120");
            System.out.println("\t\tQueen Bed == $100");
            System.out.println("\t\tSingle Bed == $80");

            String word = input.nextLine().toLowerCase();

            while (!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))) {
                System.out.println("Invalid Entry, Please Re-Enter");
                word = input.nextLine().toLowerCase();
            } // to make sure user selected either the king bed, or queen bed or single bed

            total += (word.equals("king bed")) ? 120 : (word.equals("queen bed")) ? 100 : 80;

            System.out.println("Would you like to select another room?");
            String a = input.nextLine().toLowerCase();

            while( !( a.equals("yes") || a.equals("no") ) ){ // while the answer is not valid answer
                System.out.println("Invalid Entry, please re-enter");
                System.out.println("Would you like to select another room?");
                a = input.nextLine().toLowerCase();
            } // it stops if the answer is either yes or no

            if(a.equals("no")){
                System.out.println("Your total price is: $"+total);
                break;
            }

        }

        input.close();

    }

}
/*
Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price
                If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */




