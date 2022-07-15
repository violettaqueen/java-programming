package day16_nestedLoop;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double firstNumber = 0;

        System.out.println("Enter first number:");
        firstNumber = input.nextDouble();


        System.out.println("Enter a math operator:");
        char mathOperator = input.next().charAt(0);

        while ( ! (mathOperator=='-') || mathOperator=='+' || mathOperator=='/' || mathOperator=='*'){
            System.out.println("Invalid math operator");
            System.out.println("Enter a math operator:");
            mathOperator = input.next().charAt(0);
        }
        System.out.println("Enter the second number:");
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber + mathOperator + secondNumber);

    }
}
