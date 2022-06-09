package day06_ifstatements;

/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false

 */

public class IdentifyNumber {

    public static void main(String[] args) {

        int number = 1000;
        boolean isPositive = number > 0; // if the number is greater, then 0, then its positive number
        boolean isNegative = number < 0; // if the number is less, then 0, then its negative number
        // boolean isZero = number == 0; // if the number is equal to 0, then the number is 0
        boolean isZero = !isPositive && !isNegative; // if the number is not positive and not negative, then its 0

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);





    }

}
