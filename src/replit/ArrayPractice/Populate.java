package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Populate {

    public static void populate(int nums) {

        int[] array = new int[nums];

        for (int i = 0, j = 1; i < array.length; i++, j++) {
            array[i] += j;

        }
        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {

        int num = 7;

        int[] array = new int[num];

        for (int i = 0, j = 1; i < array.length; i++, j++) {
            array[i] += j;

        }
        System.out.println(Arrays.toString(array));


    }
}


/*
Create a method called populate() that will take an int argument and print an array that is populated/filled with numbers
 starting from 1 to the given number.
This is a void method with an int parameter
Main topics: methods, Scanner, primitive datatypes, operators, arrays, loops

Example Flow:

populate(3)

output:
  [1,2,3]
populate(5)

output:
  [1,2,3,4,5]
 */