package day23_arrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); // 0
        names.add("Vasyl"); // 1
        names.add("Sumeye"); //2
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        // [Vasyl, Vasyl, Sumeye, Sumeye, Ali, Sumeye]

        System.out.println(names);

        //1. Create a new list

       ArrayList<String> nonDup = new ArrayList<>();

       //2. get all names

        for (String eachName : names) {
            if(nonDup.contains(eachName)){
                continue; // skip duplicates
            }
            nonDup.add(eachName);
        }

        // [Vasyl, Sumeye, Ali]

        names = nonDup;
        System.out.println(nonDup);

    }

}
