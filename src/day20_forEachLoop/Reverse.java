package day20_forEachLoop;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int[] reverse = new int[array.length];

// j is an index number of reverse array. every time loop gets executed, i - decreased by 1, j is increased by 1.
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i]; // i (the last element of array) has to be assigned to index 0 of reversed array
        }
        System.out.println(Arrays.toString(reverse));

        /*
        int[] array = {1, 2, 3, 4, 5};

        int[] reverse = new int[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j++] = array[i]; // i (the last element of array) has to be assigned to index 0 of reversed array
        }
        System.out.println(Arrays.toString(reverse));
         */

    }



}
/*
 Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};

 */