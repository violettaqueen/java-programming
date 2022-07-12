package selfPractice.Loops.day15_whileLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to reserve the room? Yes/No");
        String yesNo = input.next();
        input.nextLine();

        while (!(yesNo.equalsIgnoreCase("yes") || yesNo.equalsIgnoreCase("no"))) {
            System.err.println("invalid answer. Please re-enter:");
            yesNo = input.next();
        }

        if (yesNo.equalsIgnoreCase("yes")) {
            System.out.println("What type of room would you like to reserve?\n\tKing Bed ==> 120$\n" +
                    "\t            Queen Bed ==> 100$\n" +
                    "\t            single Bed ==> 80$");
            String roomType = input.nextLine().toLowerCase();

            int price = 0;

            if (roomType.equalsIgnoreCase("king bed")) {
                System.out.println("Total price = $120");
            } else if (roomType.equalsIgnoreCase("queen bed")) {
                System.out.println("Total price = $100");
            } else if (roomType.equalsIgnoreCase("single bed")) {
                System.out.println("Total price = $80");
            } else {
                System.err.println("Invalid entry. Please try again");
            }


        } else {
            System.out.println("Have a nice day!");
        }
        input.close();
    }
}
/*
 Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */