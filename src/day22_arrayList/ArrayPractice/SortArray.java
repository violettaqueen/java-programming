package day22_arrayList.ArrayPractice;

import java.util.*;
import java.util.stream.Collectors;

public class SortArray {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Jon", 12000);
        Employee employee2 = new Employee("Violetta", 20000);
        Employee employee3 = new Employee("Liza", 50000);
        Employee employee4 = new Employee("Olga", 10000);

        List<Employee> list = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4));


       list= list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());

        System.out.println(list);

    }
}
