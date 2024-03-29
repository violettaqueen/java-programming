package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        array[0] = 100;

        System.out.println(Arrays.toString(array));

        System.out.println("-------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

        // groceriesList[2] = "Oranges";
        groceriesList.set(2, "Oranges");  // to update an element value

        System.out.println(groceriesList);

        groceriesList.add(2, "Chicken");  // doesn't change an element --> increases the size

        System.out.println(groceriesList);

        groceriesList.remove(0);  // decrease the size of list, removes ONE element

        System.out.println(groceriesList);

        groceriesList.remove("Chicken"); // removes ONE ELEMENT BY PROVIDING an OBJECT

        System.out.println(groceriesList);


        System.out.println("-------------------------------------------------");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4

        // valueOf() returns Integer --> autoboxing
        boolean r1 = numbers.remove( Integer.valueOf(10) ); // IF I PASS 10 , IT WILL TAKE IT AS A PRIMITIVE int

        System.out.println(numbers);

        System.out.println(r1);

        numbers.clear();  // size will be set to ZERO, no elements anymore

        System.out.println(numbers);
        System.out.println(numbers.size());


        System.out.println("-------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(  names.indexOf("Vasyl") );  // returns an index num of element, start from right to left
        System.out.println( names.lastIndexOf("Vasyl") ); // returns index num of last matching element

        System.out.println( names.lastIndexOf("Sumeye") );


        boolean hasMuhtar = names.contains("Muhtar"); // false
        boolean hasAli = names.contains("Ali"); // true

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);

        System.out.println("-------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;  // only one object in heap memory, but sharing 2 reference variables

        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2); // referencing to a same object --> return true


        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(10);
        l2.add(10);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1 == l2);

        System.out.println(l1.equals(l2));  // comparing if 2 lists have same elements amd same order --> return true


        System.out.println("-------------------------------------------------");

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        System.out.println(n1.equals(n2));


        System.out.println(n1.isEmpty()); // to check if list has any elements, returns boolean
        System.out.println(n2.isEmpty());

        n1.clear();
        n2.clear();

        System.out.println(n1.isEmpty());
        System.out.println(n2.isEmpty());
    }
}
