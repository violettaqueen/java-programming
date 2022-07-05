package lab_days.lab03_Loops_Methods;

import java.util.Scanner;


public class PizzaAppOzzy {

    public static void main(String[] args) {

        System.out.println("Welcome to Best Pizza in Town");
        System.out.println("Please log in before placing the order");

        System.out.println(login());


    }


    public static String login(){

        //Create 3 variables named email(string),account number(int),password and assign values, DB values
        String email = "mike@gmail.com";
        int accountNumber = 123; //account number can be between >100 and <1000
        String password = "password";

        //Ask customer if he/she wants to log in with email(1) or account number(2)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your log in type. Email:1, Account Number:2");
        int loginType = scanner.nextInt();

        for (int i = 3; i > 0; ) {
            //create the selection flow for the login type
            switch (loginType) {

                case 1:  ///if I choose login type - 1, should do credential check

                    //Enter your email
                    System.out.println("Enter your email:");
                    String givenEmail = scanner.next();


                    if (!isInputValid(givenEmail)) {
                        System.out.println("Invalid Email. Please try again...");
                        continue;
                    }


                    //Enter your password
                    System.out.println("Please enter your password:");
                    String givenPassword = scanner.next();

                    //Check if log in successful
                    if ((email.equals(givenEmail) && password.equals(givenPassword))) {
                        System.out.println("Successfully logged in with email");
                        break;

                    } else { //invalid checking

                        if (i != 1) {  //ask again

                            System.out.println("Invalid credentials !! left " + (i - 1) + " chances to try");

                            i--;  //i = i-1;
                            continue;  //do not execute anything after this point, go back to for loop
                            //break;   //stop the loop here, and exit the loop
                            //return   //stop the method that you are inside

                        } else {
                            System.out.println("Your account is locked - try again tomorrow");
                            System.exit(0); //close the execution of jvm

                        }

                    }


                case 2:
                    System.out.println("Please type your account number:");
                    int an = scanner.nextInt();

                    //invalid and try again
                    if (!isInputValid(an)) {
                        System.out.println("Invalid Account Number. Try again");
                        continue;
                    }

                    System.out.println("Please enter your password");
                    givenPassword = scanner.next();

                    //Check if log in successful
                    if (an == accountNumber && password.equals(givenPassword)) {
                        System.out.println("Successfully logged in with account number");
                        break;

                    } else { //invalid checking

                        if (i != 1) {  //ask again

                            System.out.println("Invalid credentials !! left " + (i - 1) + " chances to try");

                            i--;  //i = i-1;
                            continue;  //do not execute anything after this point, go back to for loop
                            //break;   //stop the loop here, and exit the loop
                            //return   //stop the method that you are inside

                        } else {
                            System.out.println("Your account is locked - try again tomorrow");
                            System.exit(0); //close the execution of jvm

                        }


                        break;  //stop the switch-case
                    }


            }

            break; //stop the for loop

        }

        return email;

    }

    private static boolean isInputValid(int an) {

        boolean checkAccountNo = an >= 100 && an < 1000;
        return  checkAccountNo;
    }

    private static boolean isInputValid(String givenEmail) {

        //Check if the email address is valid:  //if @ . available, and @ is before . mikegmail.com
        int firstSignOfIndex = givenEmail.indexOf('@');  // -1
        int secondSignOfIndex = givenEmail.indexOf('.');

        boolean checkEmail = secondSignOfIndex < firstSignOfIndex || firstSignOfIndex < 0 || secondSignOfIndex < 0; //invalid

        if(checkEmail){
            return false;
        }

        return isEmailDomainValid(givenEmail);
    }


    private static boolean isEmailDomainValid(String givenEmail) {


        //Check if domain is valid  //gmail and hotmail domain - > mike@gmail.com
        String domain = givenEmail.substring(givenEmail.indexOf('@') + 1, givenEmail.indexOf('.'));        //gmail
        boolean checkDomain = domain.equalsIgnoreCase("gmail") || domain.equalsIgnoreCase("hotmail");

        return checkDomain;

    }








}