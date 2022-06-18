package replit;

import java.util.Arrays;
import java.util.Scanner;

public class SecondElements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        int n = 1;
        System.out.println(nums[n-1]);

    }

}
/*
Given an int [] nums print the second element and the second to last element in the following format:
Second element: $second element
Second to last element: $second to last element

Copied!
Note: The loop used in the given code is to dynamically create the int array. You don't need to fully understand this part yet, focus only on having access to an array and has some numbers.
Main topics: arrays, primitive data types, concatenation, index
 */