package day12_customMethods;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

        oddOrEven(4);

        System.out.println("----------------------------------");

        oddOrEven(100000);

        eligibleToBuyAlcohol(15);
        isOddNumber(5);
        theGradeOfStudent(71);
        maximumNumber(50, 50);

        int number1 = 100;
        oddOrEven(number1);
        int number2 = 54;
        oddOrEven(number2);
        int number3 = 72;
        oddOrEven(number3);


    }

    // the method takes an argument number, and verifies if number is odd or even
    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }

    public static void eligibleToBuyAlcohol(int age) {

        if (age >= 21) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible to buy alcohol");
        }
    }

    public static void isOddNumber(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else if (number % 2 != 0) {
            System.out.println(number + " is odd number");
        } else {
            System.out.println(number + " zero");
        }
    }

    public static void theGradeOfStudent(int score) {
        if (score >= 90) {
            System.out.println('A');
        } else if (score >= 80) {
            System.out.println('B');
        } else if (score >= 70) {
            System.out.println('C');
        } else if (score >= 60) {
            System.out.println('D');
        } else {
            System.out.println("Failed");
        }

    }

    public static void maximumNumber(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is maximum number");
        } else {
            System.out.println("Both numbers are equal");
        }
    }


}
