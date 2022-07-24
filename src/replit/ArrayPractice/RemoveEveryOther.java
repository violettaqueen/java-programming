package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveEveryOther {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("hi","yo","sup","yolo","book"));
        for (int i = 0; i < list.size(); i++) {

        }
        System.out.println(list);
    }
}
/*
Create a method that:

is called removeEveryOther
returns ArrayList of Strings
takes in a single parameter - an ArrayList of Strings called words
This method should take the ArrayList parameter and modify it by removing every other element in the list, starting with removing the 0th element.

For example, if the parameter is:

("hi","yo","sup","yolo","book")
The modified ArrayList should be:

("yo","yolo")
 */