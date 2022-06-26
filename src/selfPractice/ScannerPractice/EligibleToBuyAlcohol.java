package selfPractice.ScannerPractice;

import java.util.Scanner;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age > 20){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.err.println("Not Eligible to buy alcohol");
        }


    }
}
/*
 2. Eligible or not Eligible to buy alcohol
            2.1 Ask the user to enter his/her age
            2.2 write a program that can check if the person eligible to buy alcohol
 */