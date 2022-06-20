package selfPractice.ArrayPractice;

import java.util.Arrays;

public class ArrayReplaceTask {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(replace(array,3, 40)));
    }



    public static int[] replace(int[] array, int index, int newElement){
        for (int i = 0; i < array.length; i++) {
            if(i == index){
                array[i] = newElement;
            }
        }
        return array;
    }

    }


/*
Replace Task:
        1.1 Create a method named replace that passes three parameters: integer array, integer index, integer
        newElement.
        The method replaces the element of the array at given index with the new element, and returns the new
        array.
                Ex:
                    arr = {1,2,3,4,5};

                    replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


        1.2 Create the same functions for double arrays, char arrays, and String arrays

 */