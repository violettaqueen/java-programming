package selfPractice.ArrayPractice.day22_Practice;

import java.util.Arrays;
import java.util.Collections;

public class MaximumMinimumNumbers {

    public static void main(String[] args) {

//index of elements:
       int[][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} }; // indexes of array: 0~2
// index nums 1D array:       0             1                  2

        int max = array[0][0];
        int min = array[0][0];

        for (int[] eachArray : array) {
            for (int eachElement : eachArray) {

                if(eachElement > max){
                    max = eachElement;
                }
                if(eachElement < min){
                    min = eachElement;
                }
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
/*
2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000
 */