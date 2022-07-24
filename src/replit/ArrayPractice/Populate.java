package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Populate {

    public static void populate(int nums) {

        int[] array = new int[5];

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {};
        int num = 5;
        int array1 = 0;

        for (int i = 0; i < 5; i++) {


        }
        System.out.println(Arrays.toString(array));

    }
}


/*
Create a method called populate() that will take an int argument and print an array that is populated/filled with numbers starting from 1 to the given number.
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