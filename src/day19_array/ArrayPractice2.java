package day19_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        int[]numbers = new int[100];

        for (int i = 0, j =1; i < numbers.length; i++, j++) {
            numbers[i] = j;
        }


        System.out.println("numbers = " + Arrays.toString(numbers));

        System.out.println("-----------------------------------------------------------");

        int[]arr2 = new int[100]; //index:0-99

        for (int i = 0, j =100; i < arr2.length; i++, j--) {
            arr2[i] = j;
        }

        System.out.println("arr2 = " +Arrays.toString(arr2));
        
    }
    
}
