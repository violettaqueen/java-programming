package selfPractice.ArrayListPractice.day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static ArrayList<Integer> uniqueElements(ArrayList<Integer> list){

        list.removeIf(p -> Collections.frequency(list, p) > 1);
        return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        System.out.println(uniqueElements(list));

    }


}
/*
1. Write a program that can display the unique elements of an arrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops
 */