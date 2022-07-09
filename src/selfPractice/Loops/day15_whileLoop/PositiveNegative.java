package selfPractice.Loops.day15_whileLoop;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Enter a number");
            num = input.nextInt();


            if (num > 0) {
                positive++;
            } else if (num < 0){
                negative++;
            }else{
                num =0;
            }
        }
        System.out.println(positive + " positive and " + negative + " negative");
    }
}
/*
Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and
 print how many positive and negative numbers user entered2

			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

 */