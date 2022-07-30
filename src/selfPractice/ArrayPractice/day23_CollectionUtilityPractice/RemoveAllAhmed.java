package selfPractice.ArrayPractice.day23_CollectionUtilityPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllAhmed {

    public static ArrayList<String> removeAllSpecificNames(ArrayList<String> list, String name){

        list.removeAll(Arrays.asList(name));
        return list;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));

        System.out.println(removeAllSpecificNames(list, "Ahmed"));


    }
}
