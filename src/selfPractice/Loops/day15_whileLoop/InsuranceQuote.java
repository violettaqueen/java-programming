package selfPractice.Loops.day15_whileLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your gender: M/F");
        char gender = input.next().charAt(0);

        while (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender. Please re-entry");
        }
        System.out.println("Are you married? Yes/No");
        String married = input.next();

        while (!(married.equalsIgnoreCase("yes") || married.equalsIgnoreCase("no"))) {
            System.err.println("invalid answer. Please re-enter");
        }
        System.out.println("Enter your age:");
        int age = input.nextInt();

        while ((age < 0 || age > 120)) {
            System.err.println("Invalid age. Please provide a valid age.");
        }
        System.out.println("How many miles do you drive in a day?");
        double miles = input.nextDouble();
        while ((miles < 0 || miles < 5)) {
            System.err.println("Invalid mileage. Please provide a valid mileage.");
        }

        input.nextLine();

        System.out.println("Would you like full coverage or liability insurance?");
        String insuranceType = input.nextLine();

        System.out.println("Have you had any accidents or claims in past 5 years (Yes/No)");
        String yesOrNo = input.next().toLowerCase();
        while (!(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("no"))) {
            System.err.println("invalid answer. Please re-enter");
        }
        System.out.println("Does your car has an anti-theft device (Yes/No)");
        String deviceYesOrNo = input.next();
        while (!(deviceYesOrNo.equalsIgnoreCase("yes") || deviceYesOrNo.equalsIgnoreCase("no"))) {
            System.err.println("invalid answer. Please re-enter");
        }
        double insurancePriceLiability = 0;

        if (insuranceType.equalsIgnoreCase("liability") && age < 25) {
            insurancePriceLiability += 90;
        } else {
            insurancePriceLiability += 50;
        }
        if (miles <= 10) {
            insurancePriceLiability += 10;
        } else if (miles > 10 && miles <= 50) {
            insurancePriceLiability += 30;
        } else {
            insurancePriceLiability += 50;
        }

        double insurancePriceFull =0;

        if (insuranceType.equalsIgnoreCase("full coverage") && age < 25) {
            insurancePriceFull += 160;
        } else {
            insurancePriceFull += 120;
        }
        if (miles <= 10) {
            insurancePriceFull += 20;
        } else if (miles > 10 && miles <= 50) {
            insurancePriceFull += 40;
        } else {
            insurancePriceFull += 70;
        }
        if(deviceYesOrNo.equalsIgnoreCase("yes")){
            insurancePriceLiability += insurancePriceLiability - 0.05;
        }
        if(deviceYesOrNo.equalsIgnoreCase("yes")) {
            insurancePriceFull += insurancePriceFull - 0.05;
        }
        if (yesOrNo.equalsIgnoreCase("yes")){
            insurancePriceLiability += 0.15;
        }
        if (yesOrNo.equalsIgnoreCase("yes")){
            insurancePriceFull += 0.15;
        }
        if (yesOrNo.equalsIgnoreCase("no")){
            insurancePriceLiability += insurancePriceLiability - 0.10;
        }
        if (yesOrNo.equalsIgnoreCase("no")){
            insurancePriceFull += insurancePriceFull - 0.10;
        }
        if (married.equalsIgnoreCase("yes")){
            insurancePriceLiability += insurancePriceLiability - 0.05;
        }
        if (married.equalsIgnoreCase("no")){
            insurancePriceFull += insurancePriceFull - 0.05;
        }
        System.out.println(insurancePriceFull);
    }
}
/*
 Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				4. Ask user to enter your age
						(age can not be negative or greater than 120)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				5. Ask user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance?

				7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount
 */