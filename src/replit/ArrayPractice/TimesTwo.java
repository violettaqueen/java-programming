package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class TimesTwo {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(2,3,4));

        timesTwo(nums);
        System.out.println(nums);

        }

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){




        return nums;
    }

    }


/*
Create a method that:

is called timesTwo
returns an ArrayList of Integers
takes in a single parameter - an ArrayList of Integers called nums
This method should take the ArrayList parameter and multiply every value by two.
 */