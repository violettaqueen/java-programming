package selfPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);
    }
}
/*
Write a program that can duplicate the elements of an arraylist
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];

 */