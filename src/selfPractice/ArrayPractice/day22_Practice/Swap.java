package selfPractice.ArrayPractice.day22_Practice;

import java.util.Arrays;

public class Swap {

    public static int[] swap (int[] arr, int i, int j){

        int temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50};
        int i = 2;
        int j = 4;
        System.out.println(Arrays.toString(swap(arr, i, j)));







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