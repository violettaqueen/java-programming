package selfPractice.ScannerPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = input.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(num1 + " is an even number");
        } else {
            System.out.println(num1 + " is an odd number");
        }

        input.close();
    }
}
/*
 Odd or Even number
            1.1 Ask the user to enter a number
            1.2 determine if the number is odd or even
 */