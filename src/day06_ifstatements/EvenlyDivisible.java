package day06_ifstatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 288;

        boolean isDivisibleBy2 = number % 2 == 0;
        // if the remainder of number divided by 2 is equal to 0, then it's evenly divisible by 2
        boolean isDivisibleBy3 = number % 3 == 0;
// if the remainder of number divided by 3 is equal to 0, then it's evenly by 3
        boolean isDivisibleBy5 = number % 5 == 0;
// if the remainder of number divided by 3 is equal to 0, then it's evenly by 5
// boolean isDivisibleBy6 = number % 6 == 0;
        boolean isDivisibleBy6 = isDivisibleBy2 && isDivisibleBy3;
// if a number is evenly divisible by both 2 and 3, then the number is evenly divisible by 6

        System.out.println(number + " is divisible by 2: " + isDivisibleBy2);
        System.out.println(number + " is divisible by 3: " + isDivisibleBy3);
        System.out.println(number + " is divisible by 5: " + isDivisibleBy5);
        System.out.println(number + " is divisible by 6: " + isDivisibleBy6);
    }

}
