package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineAll {

    public static ArrayList<Integer> combineAll(ArrayList<Integer> numbersOne, ArrayList<Integer> numbersTwo){

        ArrayList<Integer> list = new ArrayList<>();

        for (Integer eachNumber1 : numbersOne) {
            list.addAll(Arrays.asList(eachNumber1));
        }
        for (Integer eachNumber2 : numbersTwo) {
            list.addAll(Arrays.asList(eachNumber2));
        }

        return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));

        System.out.println(combineAll(list1, list2));
    }

}
/*
Create a static method that:

is called combineAL
returns an ArrayList<Integer>
takes two parameters: an ArrayList of numbers called numbersOne, and another ArrayList of numbers called numbersTwo
This method should create a new ArrayList of Integer, add all the numbers (in order) from numbersOne, then add all the
 numbers (in order) from numbersTwo. In other words, it is combining all the elements from the two lists.
 */