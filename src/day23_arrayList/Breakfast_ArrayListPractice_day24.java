package day23_arrayList;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Breakfast_ArrayListPractice_day24 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        // add multiple elements to list, pass them as a collection type: use Arrays.asList
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee() ));

        // get index number provided in list above, call instance method setInfo
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        //1.1 Write a program that can display the name and job title of each employee
       for (Employee each : employees){
           System.out.println(each.name + " : " + each.jobTitle);
       }
        // 1.2 Write a program that can display the names of "Java Developers"
        for (Employee each : employees) { //we have an access to each employee object - each
            if(each.jobTitle.equals("Java Developer")){ //if the job title is Java Developer
                System.out.println(each.name); // print each developer who is Java Developer
            }
        }
        // 1.3 Write a program that can display the maximum and minimum salary
        double max = employees.get(0).salary;// first employee salary, return me object, so call the salary
// it's just an assumption, compare with every single salary from array list. get a loop to get every single employee object
        for (Employee each : employees) {
            if(each.salary > max){
                max = each.salary; // store to variable max
            }
        }
        System.out.println("max = " + max);
        
        double min = employees.get(0).salary;

        for (Employee each : employees) {
            if(each.salary < min){
                min=each.salary;
            }
        }
        System.out.println("min = " + min);

        //  1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that can add
        //        all the female employees and male employees to the femaleEmployees and maleEmployees arraylists

        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee> maleEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            if(employee.gender == 'M'){
                maleEmployees.add(employee);
            }else{
                femaleEmployees.add(employee);
            }
        }
        System.out.println("Total number of female employees: " + femaleEmployees.size());
        System.out.println("Total number of male employees:" + maleEmployees.size());
        }

    }





/*
1. Given the following arraylist of Employees:
            ArrayList<Employee> employees = new ArrayList<>();
            employees.addAll(Arrays.asList(
                   new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
            ));

            employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
            employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
            employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
            employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
            employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

            Note: Employee class is imported from day17 package

        1.1 Write a program that can display the name and job title of each employee

        1.2 Write a program that can display the names of "Java Developers"

        1.3 Write a program that can display the maximum and minimum salary

        1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that can add
        all the female employees and male employees to the femaleEmployees and maleEmployees arraylists
 */