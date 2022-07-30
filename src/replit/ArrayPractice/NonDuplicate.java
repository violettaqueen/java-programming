package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NonDuplicate {

    public static void main(String[] args) {

        int[] nums = {6, 44, 6, 4, 3, 4, 1};

        int nonDup = 0;

        for (int element: nums) { // element

            int count = 0;

            for (int each : nums) {

                if( each == element){
                    count++;
                }
            }
            if(count == 1){
                nonDup = element;
                break;
            }

        }
        System.out.println(nonDup);

    }
}
/*
Given an int [] nums that has duplicate numbers, which means each numbers is found twice in the array. Find and print the
non-duplicate number, which mean the ones that does not have two occurrences of it. If there is more than one, return the first
unique in array!
Main topics: arrays, primitive datatypes, index, operators, loops, if statements, counter

Example:

Input:
  [1, 2, 3, 4, 3, 4, 1]

Output:
  2
Input:
  [6, 44, 6, 4, 3, 4, 1]

Output:
  44 (more than one unique number. but 44 is the first)
 */