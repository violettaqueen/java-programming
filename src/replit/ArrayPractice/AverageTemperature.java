package replit.ArrayPractice;

import java.util.Arrays;

public class AverageTemperature {

    public static void main(String[] args) {


        double[] temps = {80, 88, 88, 84, 82, 78, 60, 68};

        double sum = 0;

        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];
        }
        double average = sum / (double )temps.length;
        System.out.println(average);
    }


}
/*
Given a double [] temps that has the temperature values from the previous couple day, find and print the
average temperature.
Main topics: arrays, primitive data types, concatenation, index, operators, loops

Example:

Input:
  [80, 88, 88, 84, 82, 78, 60, 68]

Output:
  78.5
 */