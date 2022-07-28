package selfPractice.ArrayPractice.day22_Practice;

import java.util.Arrays;

public class ReplaceTask {

    public static int[] replaceElement(int[] array, int index, int newElement) {

        int[] newArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                newArray[index] = newElement;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        arr[2] = 30;
        int[] arr1 = replaceElement(arr, 2, 30);
        System.out.println(Arrays.toString(arr1));


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