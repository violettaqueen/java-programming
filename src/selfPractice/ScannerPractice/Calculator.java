package selfPractice.ScannerPractice;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter a math operator: ");
        char operator = input.next().charAt(0);

        System.out.println("Enter the second number: ");
        double num2 = input.nextDouble();

        if (operator == '-' || operator == '+' || operator == '*' || operator == '/'){

            double result = 0;

            switch (operator){
                case '-':
                    result += num1 = num2;
                    break;
                case '+':
                    result += num1 + num2;
                    break;
                case '*':
                    result += num1 * num2;
                    break;
                case '/':
                    result += num1 / num2;
                    break;

            }
            System.out.println("Result: " + result);

        }else{
            System.out.println("Invalid entry!");
        }

        input.close();


    }
}
/*
Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"

 */