package selfPractice.Loops.day15_whileLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 2;
        int count = 0;

        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count + " with a remainder of " + num1);

    }
}
/*
 Create a class named DivideTwoNumbers and Write a program that can divide two positive numbers without
  using / (division) and * (multiplication) operators.
 */