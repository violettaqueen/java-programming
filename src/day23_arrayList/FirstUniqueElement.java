package day23_arrayList;
/*
3. Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}
			output:
				2
 */

import java.util.ArrayList;

public class FirstUniqueElement {

    public static void main(String[] args) {

        // return first unique element:

        ArrayList<Integer> list = new ArrayList<>();
        // 1. create list of elements
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
       // 2. print list of elements
        System.out.println(list);

       // 3. Declare 2 int variables:

        //int element = 1;
        int frequency = 0;

        // 4. find frequency of all elements
        // 5. all elements in the list

        // to find frequency of every single element:
        for (Integer element : list) { // accessing all elements in list

            // this is how we find frequency of one element
            for (Integer each : list) {
                if (each == element) { // if element I want to find frequency of matching with every element from the list
                    frequency++;
                }

            }
            if (frequency == 1) {
                System.out.println(element);
                break; // no need to repeat this loop, exiting the loop, in order to return the first unique element only
            }

        }


    }

}
