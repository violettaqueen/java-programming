package day16_nestedLoop;

import utilities.StringUtility;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String userName = input.next();

        System.out.println("Enter your password: ");
        String password = input.next();

        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) { // if credentials are correct
            System.out.println("You are logged in");
        } else {

            for (int i = 0; i < 3; i++) {  // repeat for 3 times

                if(i != 2){
                    System.err.println("Incorrect username or password, please re-enter");
                }else{
                    System.err.println("This is your last attempt, please re-enter your username and password");
                }

                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username: ");
                userName = input.next();

                System.out.println("Enter your password: ");
                password = input.next();

                if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) { // if credentials are correct
                    System.out.println("You are logged in");
                    break; // if right credentials, exits the loop
                }
            }
            if( ! (userName.equals("Cydeo") && password.equals("WoodenSpoon"))){ // after all 3 attempts,
                // if credentials still incorrect
                System.err.println("Your account is locked, please contact with the support team");
            }
        }
        input.close();
    }
    public static void cydeoLogIn (String userName, String password){ //creating a method

    }
    public static void login(String userName, String password){

        if (userName.equals(userName) && password.equals(password)){
            System.out.println("You are logged in");
        }else{
            System.out.println("Incorrect credentials");
        }

    }
}


/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application,
assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."

 */