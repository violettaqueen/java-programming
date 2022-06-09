package day06_ifstatements;

public class IfStatementsIntro {

    public static void main(String[] args) {

        int number = 200;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;


        int number1 = 100;
        System.out.println(number1 + " is positive number");

        if (isPositive) {
            //System.out.println(number1 + " is positive number");

        }
        ;

        if (isNegative) {
            System.out.println(number + " is negative number");
        }
        if (isZero) {
            System.out.println(number + " is zero");
        }

        System.out.println("-----------------------------------");

        int num = 100;
        if (num > 0) {
            System.out.println(num + " is positive");
        }
        if (num < 0) {
            System.out.println(num + " is negative");
        }

        if (num == 0) {
            System.out.println(num + " is zero");
        }

    }
}
