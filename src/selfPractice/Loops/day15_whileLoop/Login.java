package selfPractice.Loops.day15_whileLoop;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String userName = input.next();

        System.out.println("Enter your password:");
        String password =  input.next();

while(userName.equals("Cydeo") && password.equals("Cydeo123")){
    System.out.println("You are logged in");
}
        for (int i = 1; i <= 3; i++) {

      if (!(userName.equals("Cydeo") && password.equals("Cydeo123"))) {
          System.out.println("Incorrect credentials. Please try again. You have 3 attempts");
          userName = input.next();
          password = input.next();

      }else {
          System.out.println("Your account is logged");



          }


      }





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