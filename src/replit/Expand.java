package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Expand {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i =0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        int[] newNums = new int[6];
        newNums = Arrays.copyOf(nums, 6);
        System.out.println(Arrays.toString(newNums));





    }
}
/*
Given an int [] nums create a new array that is an expanding version of nums. The new array will hold
double the elements, and the original elements from nums should be stored at the beginning of the new
array. You can assume the size of nums will be 3.
Note: The loop used in the given code is to dynamically create the int array. You don't need to fully
understand this part yet, focus only on having access to an array and has some numbers.
Main topics: arrays, primitive data types, concatenation, index, operators
 */