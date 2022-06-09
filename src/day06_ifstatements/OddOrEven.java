package day06_ifstatements;

public class OddOrEven {
    /*
    Warmup task:
	1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false


		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
     */

    public static void main(String[] args) {

        int number = 45;
        boolean isEven = number % 2 == 0; //when we divide a number by 2, if the remainder is 0, means the number is even
        // boolean isODD = number % 2 != 0; // when we divide
        boolean isOdd = !isEven;

        System.out.println(number + " is an even number: " + isEven);

        System.out.println(number + " is an odd number: " + isOdd);

    }

}