package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class TimesTwoArrayListReturnMethod {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(2, 4));

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < nums.size(); i++) {
            list.addAll(Arrays.asList(nums.get(i) * 2));
        }
        System.out.println(list);


    }

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums) {


        ArrayList<Integer> list = new ArrayList<>();
        nums.addAll(Arrays.asList());

        for (int i = 0; i < nums.size(); i++) {

            list.addAll(Arrays.asList(nums.get(i) * 2));
        }
        return list;
    }
}
/*
Create a method that:

is called timesTwo
returns an ArrayList of Integers
takes in a single parameter - an ArrayList of Integers called nums
This method should take the ArrayList parameter and multiply every value by two.
 */