package selfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListRemoveLastZerosFromArray {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        for (int i = list.size() - 1; i >= 0; i--) {
            Collections.reverse(list);
            System.out.println(list);
        }
    }

}
/*
Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]

 */