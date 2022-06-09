package selfPractice;
/*
1. Create a class named KilosToPounds and declare the following variables:
				kg
				lb

	1.1 Write a program that can convert the any given number of kilos to pounds
		Ex:
		      kg = 10.5

		output:
		      10.5 kilos is equal to 23.1 pounds

	       Hint:  1kg = 2.2 lb
 */

import java.util.Scanner;

public class KilosToPounds {

    public static void main(String[] args) {


        double kg = 10.5;
        double lb = (kg * 2.2);
        System.out.println(kg + " kilos is equal to " + lb + " pounds");

    }

}
