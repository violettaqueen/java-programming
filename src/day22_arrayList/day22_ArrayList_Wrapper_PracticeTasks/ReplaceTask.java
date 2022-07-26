package day22_arrayList.day22_ArrayList_Wrapper_PracticeTasks;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReplaceTask {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        arr[2] = 30;
        System.out.println(Arrays.toString(arr));

        int[] numbers = {1, 2, 3, 4, 5};
        numbers = ArraysUtility.removeTheElement(numbers, 1);
        System.out.println(Arrays.toString(numbers));

    }
}

   /* public static int replace(int[] array, int[] index, int[] newElement){
        int[] arr = {1, 2, 3, 4, 5};
        arr[2] = 30;
        return int[] arr;

        }





}
/*
Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, integer
        newElement. The method replaces the element of the array at given index with the new element, and
        returns the new array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays

 */