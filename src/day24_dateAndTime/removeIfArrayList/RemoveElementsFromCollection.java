package day24_dateAndTime.removeIfArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementsFromCollection {

    public static ArrayList<Integer> removeElements(ArrayList<Integer> list){

        list.removeIf(p -> p < 4);
        return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        System.out.println(removeElements(list));
    }

}
/*
 2. Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]

 */