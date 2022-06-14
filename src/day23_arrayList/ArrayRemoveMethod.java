package day23_arrayList;

import java.util.ArrayList;

public class ArrayRemoveMethod {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        numbers.add(50); //4

        numbers.remove(Integer.valueOf(10)); // can assign to boolean
        //boolean r1 =  numbers.remove(Integer.valueOf(10));
        System.out.println(numbers);
    }
}
