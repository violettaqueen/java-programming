package selfPractice.ArrayPractice.day23_CollectionUtilityPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveAllZeros {

    public static ArrayList<Integer> moveAllZeros(ArrayList<Integer> list){

        // count zeros:
        int countZeros = Collections.frequency(list, 0);

        // remove all zeros:
        list.removeAll(Arrays.asList(0));

        // add zeros to the end of list:
        for (int i = 0; i < countZeros; i++) { // indexes
            list.add(0);
        }
        return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(moveAllZeros(list));
    }
}
