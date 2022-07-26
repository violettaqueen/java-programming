package day23_arrayList;
/*
indexOf start from the beginning and return index number of elements
lastIndexOf return lastIndex number of elements

 */

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");

        // 1. to get all the names of the Array List

        for (String each :names) {
            if(names.indexOf(each) == names.lastIndexOf(each)){ // if each element has occured at first position is equal to last time
                // this occured in the list
                System.out.println(each);
                break; //exit the loop, display only first unique
            }
        }


    }

}
