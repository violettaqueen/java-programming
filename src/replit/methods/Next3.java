package replit.methods;

public class Next3 {

    public static void main(String[] args) {

        next3(10);


    }

    public static void next3(int num) {

        for (int i = 0, j = num; i < 3; i++, j++) { // i --> number of times to repeat
            System.out.print(j + 1 + " ");
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
Example:
next3(10)

output:
  11 12 13
 */