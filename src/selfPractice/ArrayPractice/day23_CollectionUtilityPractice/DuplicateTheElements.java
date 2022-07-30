package selfPractice.ArrayPractice.day23_CollectionUtilityPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateTheElements {

    public static ArrayList<Integer> duplicateElements(ArrayList<Integer> list){

        list.addAll(list);
        return list;
    }

}
