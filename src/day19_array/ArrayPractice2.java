package day19_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int[]numbers = new int[100];

        for (int i = 0, j =1; i < numbers.length; i++, j++) { // j is elements that I want to assign to these i index numbers
            numbers[i] = j;  // numbers[i] --> get to the index numbers, assign j that starts from 1
        }
        System.out.println(Arrays.toString(numbers));

        // if I want to print  numbers like 10, 20, 30....This loop will execute for 100 times
        for (int i = 0, j =10; i < numbers.length; i++, j+=10) { // j is elements that I want to assign to these i index numbers
            numbers[i] = j;  // numbers[i] --> get to the in
        }

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("-----------------------------------------------------------------------------------------------");

        int[] arr1 = new int [100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;  // i = 0 --> +1 , gives us 1, we assign it to i
        }

        System.out.println("arr1 = " + Arrays.toString(arr1) );


        System.out.println("-----------------------------------------------------------");

        // reverse array:

        int[]arr2 = new int[100]; //index:0-99

        for (int i = 0, j =100; i < arr2.length; i++, j--) {
            arr2[i] = j;
        }
        System.out.println("arr2 = " +Arrays.toString(arr2));

        for (int i = 0 ; i < arr2.length; i++) {
            arr2[i] = 100 - i;
        }


        System.out.println("arr2 = " +Arrays.toString(arr2));
        
    }
    
}
