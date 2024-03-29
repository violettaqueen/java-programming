package replit.ArrayPractice;

import utilities.ArraysUtility;

public class Next3 {

    public static void main(String[] args) {

        int num = 6;

        for (int i = 0, j = num; i < num; i++, j++) {
            System.out.println(j + 1);

        }


    }
}

/*
Create a method called next3() that will take an int argument and print the three numbers that come after the given number.
 The next3() method is already called in the main method. Print in the following format:
$number1 $number2 $number3

The three next numbers are printed on the same line with spaces between them
This is a void method with an int parameter
Main topics: methods, Scanner, primitive datatypes, operators

Example:

next3(1)

output:
  2 3 4
  next3(10)

output:
  11 12 13
 */