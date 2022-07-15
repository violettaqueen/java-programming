package day16_nestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while(answer.equals("yes")) {


            System.out.println("Enter first number:");
            double firstNumber = input.nextDouble();


            System.out.println("Enter a math operator:");
            char mathOperator = input.next().charAt(0);

           // while this operator is invalid, code fragment to be repeated over and over until user provides valid operator
            while (! (mathOperator == '-' || mathOperator == '+' || mathOperator == '/' || mathOperator == '*')) {
                System.err.println("Invalid math operator. Re-enter the operator");
                mathOperator = input.next().charAt(0);
            }

            System.out.println("Enter the second number:");
            double secondNumber = input.nextDouble();

            double result = (mathOperator == '+') ? firstNumber + secondNumber : (mathOperator == '-') ? firstNumber - secondNumber
                    : (mathOperator == '*') ? firstNumber * secondNumber : firstNumber / secondNumber;
            System.out.println("result = " + result);

            System.out.println("Would you like to continue? Yes/No");
            answer = input.next().toLowerCase();

            while(! (answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid answer. Please re-enter:");
                System.out.println("Would you like to continue? Yes/No");
                answer = input.next().toLowerCase();
            }
        }
    }
}