package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementsFromCollection {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        // arrayList remove() , it's going remove at specified index, use regular for loop to get index number

        for (int i = 0; i < list.size(); i++) { //i value is 0-9
          if( list.get(i)<4){
              list.remove(i); // this method doesn't work to remove elements
          }
        }
        System.out.println(list);
        System.out.println("-----------------------------------------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        System.out.println(list2);

        list2.removeIf( p -> p<4 );// provide the condition
        System.out.println(list2);
        System.out.println("----------------------------------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java", "Python", "C#", "Java", "Ruby", "JavaScript", "C+", "C"));

                          // each is a String
        names.removeIf( each -> each.startsWith("J") ); //each element from list, loop is created as long as you call remove if method
        System.out.println(names);

        System.out.println("------------------------------------------------------------------------");

        // remove employee that makes more then 100000 dollars
        // use remove if method
        ArrayList<Employee> employees = new ArrayList<>();

        // add multiple elements to list, pass them as a collection type: use Arrays.asList
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee() ));

        // get index number provided in list above, call instance method setInfo
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        employees.removeIf( p -> p.salary > 100000 );

        for (Employee each : employees) {
            System.out.println(each.name + " : " + each.salary);
        }


    }
}

/*
 Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]
 */