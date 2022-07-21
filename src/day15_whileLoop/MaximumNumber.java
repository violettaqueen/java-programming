package day15_whileLoop;
/*
1. Write a program that can ask the user to enter a number for 5 times
and returns the maximum number;
 */

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //1. scanner object

        int max = -2147483648; //any number be greater then this

        for (int i = 0; i < 5; i++) {           //2. for loop

            System.out.println("Enter a number: ");//3. print statement

            int num = input.nextInt();           //4. get 5 inputs

            if(num > max){ //if user entered entry is greater than the current maximum number thar we have
                max = num; //then user entered number should be the maximum number
            }

        }
        System.out.println("maximum number is = " + max);
    }

}
