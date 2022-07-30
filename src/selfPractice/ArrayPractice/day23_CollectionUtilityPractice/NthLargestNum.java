package selfPractice.ArrayPractice.day23_CollectionUtilityPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNum {

    public static int nthLargestNumber(ArrayList<Integer> list, int n) {

        for (int i = 1; i < n; i++) { // i: elements
            list.removeIf(p -> Collections.max(list) == p);
        }
     return Collections.max(list);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        System.out.println(nthLargestNumber(list, 5));
    }
}

