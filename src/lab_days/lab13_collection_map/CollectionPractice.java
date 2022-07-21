package lab_days.lab13_collection_map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionPractice {

    public static void main(String[] args) {

       // Collection<Integer> collection = new ArrayList<>();  // OOP Polymorphism, parent is a reference type
        // collection doesn't have all the methods that Array list has, no get(), this is disadvantage

        List<Integer> list = new ArrayList<>();
        list.add(100); // first element, order is preserved because has index, allows dup
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);

        System.out.println(list.get(0));
        System.out.println(list);

        System.out.println("--------------------------------------------------------------------------------------");

        List<String> names = new ArrayList<>();




    }
}
