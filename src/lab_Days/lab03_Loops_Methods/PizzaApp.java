package lab_Days.lab03_Loops_Methods;

import java.util.Scanner;

public class PizzaApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the best Pizza in town");
        System.out.println("Please log in before placing the order");

        // create 3 variables named email(string),account number(int),
        //password and assign values

        String email = "mike@gmail.com";
        int accountNumber = 123;
        String password = "password";

        // ask customer to log in with email(1) or account number(2)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your log in type. Email:1, Account:2");
        int loginType = scanner.nextInt();

        // create a selection flow for the login type

        switch (loginType){
            case 1:
                // enter your email
            System.out.println("Enter your email:");
            String givenEmail = scanner.next();

            // check if the email address is valid: if @ . available, and @ is before
                int firstSignOfIndex = givenEmail.indexOf('@');
                int secondSignOfIndex = givenEmail.indexOf('.');

                boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 ||
                        secondSignOfIndex < 0;

                if(checkEmail){
                    System.out.println("Invalid Email address");
                }
                // check if domain is valid
                break;


            case 2:
            System.out.println("Enter your account number:");
            break;
        }
    }

}
