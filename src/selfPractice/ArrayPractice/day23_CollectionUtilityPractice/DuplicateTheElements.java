package selfPractice.ArrayPractice.day23_CollectionUtilityPractice;

import day23_arrayList.ArrayArrayListConversion;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateTheElements {

    public static ArrayList<Integer> duplicateElements(ArrayList<Integer> list){

        list.addAll(list);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(duplicateElements(list));
    }
}
