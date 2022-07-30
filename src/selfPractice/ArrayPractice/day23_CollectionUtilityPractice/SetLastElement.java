package selfPractice.ArrayPractice.day23_CollectionUtilityPractice;


import java.util.ArrayList;
import java.util.Arrays;

public class SetLastElement {

    public static ArrayList<Integer> setLastElement(ArrayList<Integer> list, int element){

        list.set(list.size()-1, 0);
        return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(setLastElement(list, 0));
    }
}
