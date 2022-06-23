package replit.ArrayPractice;

public class PrintSecondElementArray {

    public static void main(String[] args) {

        int[] array = {0,1,2,3,4,5,7,8,9};
        System.out.println("Second element: " + array[1] +"\n" + "Second to last element: " + (array.length-1));


    }
}

/**
Given an int [] nums print the second element and the second to last element in the following format:
Second element: $second element
Second to last element: $second to last element

Copied!
Note: The loop used in the given code is to dynamically create the int array. You don't need to fully understand this part yet, focus only on having access to an array and has some numbers.
Main topics: arrays, primitive data types, concatenation, index
 */
