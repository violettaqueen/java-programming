package selfPractice.Custom_Methods;

import utilities.StringUtility;

public class CustomMethodsTasks {

    public static void eligibleToBuyAlcohol(int age) {

        if (age > 20) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

    }

    public static void oddOrEvenOrZero(int number) {

        if (number >= 1) {


            if (number % 2 == 0) {
                System.out.println("Even number");

            } else if (number % 2 != 0) {
                System.out.println("Odd number");

            }
        } else {
            System.out.println("Zero");
        }
    }

    public static void calculateGrade(int score) {

        if (score >= 100 && score <= 0) {


            if (score > 90) {
                System.out.println("A");
            } else if (score < 90 && score > 80) {
                System.out.println("B");
            } else if (score < 80 && score > 70) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        } else {
            System.out.println("invalid score");
        }
    }

    public static void maximumNumber(int num1, int num2) {

        if (num1 > num2) {
            System.out.println(num1 + " is max");
        } else if (num2 > num1) {
            System.out.println(num2 + " is a max");
        } else {
            System.out.println(num1 + " and " + num2 + " Equal");
        }

    }

    public static void initials(String firstName, String lastName) {

        firstName = firstName.substring(0, 1).toUpperCase();
        lastName = lastName.substring(0, 1).toUpperCase();
        System.out.println(firstName + "." + lastName + ".");
    }


    public static void main(String[] args) {

        eligibleToBuyAlcohol(21);

        oddOrEvenOrZero(1);

        calculateGrade(110);

        maximumNumber(10, 5);

        initials("Violetta", "Queen");

        StringUtility.reverse("Violetta");
        System.out.println(StringUtility.reverse("Violetta"));

        initials("violetta", "queen");

    }
}
