package day15_WhileLoop;

import java.util.Scanner;

public class MaximumAndMinimumNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648; //any integer that user enters be bigger then max number
        int min = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your number: ");
            int num = input.nextInt();

            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }
        System.out.println("Maximum number is: " +max);
        System.out.println("Minimum number is: " +min);


    }

}
/*
2. Write a program that can ask the user to enter a number for 5 times and returns the minimum number
 */