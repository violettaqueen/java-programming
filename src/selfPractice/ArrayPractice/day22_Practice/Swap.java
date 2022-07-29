package selfPractice.ArrayPractice.day22_Practice;

import java.util.Arrays;
import java.util.Collections;

public class Swap {

    public static int[] swap (int[] array, int i, int j){

        int[] newArray = new int[array.length];

        for (int each : array) {
            Collections.swap(Arrays.asList(array), i, j);
        }
        return newArray;
    }

    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50};
    }
}
/*
Swap Task:
    2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j.
     the method swaps the element at index i with the element at index j, and returns the new array
            Ex:
                arr = {10, 20, 30, 40, 50};

                swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

    2.2 Create the same function for double array, char array and string array

 */