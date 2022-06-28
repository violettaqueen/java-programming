package selfPractice.String;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username and a password:");
        String userName = input.next();
        String password = input.next();

        String userNameValid = "Cydeo";
        String passwordValid = "WoodenSpoon";

        if (userName.equals(userNameValid) && password.equals(passwordValid)){
            System.out.println("You are now logged in!");
        }else{
            System.out.println("Incorrect username or password. Please try again");
        }
    }
}
/*
 Create a class named LogIn
            2.1 Ask the user to enter the username & password
            2.2 print "You are not logged in" If user entered valid username and password
                otherwise print the error message "Incorrect username or password. Please try again"

            Note: Assume that the valid credentials are:
                        username: Cydeo
                        password: WoodenSpoon

 */