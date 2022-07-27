package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveInstances {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,3,1,4)); // p --> index number of arrayList elements
        Integer n = 1;





        System.out.println(removeInstances(list,1));
    }

    public static ArrayList <Integer> removeInstances(ArrayList<Integer> r, Integer n) {

        r.removeAll(Arrays.asList(n));

        return r;
    }
    }

/*
This method gets an Arraylist of Integers and a number(Integer). It returns an Arraylist.

It removes any instance of the given number from the Arraylist.

Example:

romoveInst([1,1,2,3,1,4],1)

returns: [2,3,4]
romoveInst([3,4,3,3],4)

returns: [3,3,3]
 */