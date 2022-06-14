package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);

        list.add(10); //0
        list.add(20); //1
        list.add(30); //2
        list.add(10); //3

        list.add(1, 15);


        System.out.println(list);

        list.add(2, 25);

        System.out.println(list);

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Violetta");
        studentsList.add("Liza");
        studentsList.add("Sofia");
        studentsList.add("Nathan");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String firstStudent = studentsList.get(0);
        System.out.println(firstStudent);

        String secondStudent = studentsList.get(1);
        System.out.println(secondStudent);

        String lastStudent = studentsList.get(studentsList.size()-1);
        System.out.println(lastStudent);

    }


}
