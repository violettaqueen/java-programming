package replit.arrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TimesTwo {

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){

        for (Integer each : nums) {

            if(each > 0){
                Collections.replaceAll(nums, each, (2*each));
                }
            }

        return nums;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(3,4,5,1,2,9));

        System.out.println(timesTwo(nums1));
    }
}
/*
Create a method that:

is called timesTwo
returns an ArrayList of Integers
takes in a single parameter - an ArrayList of Integers called nums
This method should take the ArrayList parameter and multiply every value by two.
 */