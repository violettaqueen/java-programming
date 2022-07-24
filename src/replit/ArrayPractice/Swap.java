package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("one","two","three"));
        Collections.swap(list, 0, 2);
        System.out.println(list);


    }
    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) {

        Collections.swap(list, pos1, pos2);
        return list;
    }
}
/*
In this assignment you will swap a position in an array list with another.

swap() gets 3 arguments, an Arraylist, a position, and another position to swap with.

Example

swap(["one","two","three"],0,2)

returns:["three","two","one"]
swap(["a","c","b","d","e"],0,3)

returns:["d","c","b","a","e"]
 */