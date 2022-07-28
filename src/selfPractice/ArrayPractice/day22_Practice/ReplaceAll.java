package selfPractice.ArrayPractice.day22_Practice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReplaceAll {

    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        int[] newArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
                newArray[i] = newElement;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {

        char[] arr = {'a','b','c','d','d'};

       char[] newArray = ArraysUtility.replaceAll(arr, 'd', 'm');
        System.out.println(Arrays.toString(arr));

    }
}
/*
2. RecplaceAll Task:
        2.1 Create a method named replace that passes three parameters: integer array, integer oldElement,
        integer newElement. The method replaces all the element of the array that matching with the given
         old element with the given new element, and returns the new array.
            Ex:
                arr = {10, 10, 20, 30, 40, 30, 30, 30};

                replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}


        2.2 Create the same functions for double arrays, char arrays, and String arrays
 */