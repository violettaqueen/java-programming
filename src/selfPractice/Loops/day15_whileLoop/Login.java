package selfPractice.Loops.day15_whileLoop;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String userName = input.next();

        System.out.println("Enter your password:");
        String password = input.next();

        if (userName.equals("Cydeo") && password.equals("Cydeo123")) { // if the credentials are correct
            System.out.println("You are logged in");
        } else { // otherwise


            for (int i = 1; i <= 3; i++) {

                System.err.println("Incorrect username or password, please re-enter");

                System.out.println("Enter your username:");
                userName = input.next();

                System.out.println("Enter your password:");
                password = input.next();

                if (userName.equals("Cydeo") && password.equals("Cydeo123")) { // if the user enters valid credentials
                    System.out.println("You are now logged in");
                    break;  // exit the loop
                }
            }
            if (!(userName.equals("Cydeo") && password.equals("Cydeo123"))) { // after all three attempts, if credentials are still incorrect
                System.err.println("Your account now is locked, please contact with support team");


            }


        }
        input.close();

    }
}
/*
you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three
                 attempts to enter correct credentials and if all three attempts are failed, then print
                  "Your account is lucked."
 */