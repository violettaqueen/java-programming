package selfPractice.ScannerPractice;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double radius = input.nextDouble();

        double area = 3.14 * (radius * radius);
        double perimeter = 2 * (3.14 * radius);

        System.out.println("Area of the circle : " + area+ "\n" + "Perimeter of circle : " + perimeter);

        input.close();
    }
}
/*
Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */