package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Violetta", "Java Developer", 'F', 'F', 95000, LocalDate.of(1984,12,1));
        Employee employee2 = new Employee("Elizabeth", "Java Developer", 23, 'F',200000, LocalDate.of(2011, 12,2));
        Employee employee3 = new Employee("Olga", "Java Developer", 45, 'F', 122000, LocalDate.of(1976, 12,4));

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }
}
