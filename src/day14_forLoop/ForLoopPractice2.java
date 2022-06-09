package day14_forLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        // enter number 10 times fot user
        Scanner input = new Scanner(System.in);



        for (int i = 1; i < 10 ; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            sum =+  input.nextInt();
        }
        System.out.println("sum = " + sum);

// write a program that asks user to enter a number for five times, print the maximum number
// write a program that asks user to enter a number for five times, print the maximum number

        }

    }


