package day30_Inheritance.Types_of_Inheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Violetta", 'F', LocalDate.of(1984, 12, 01), 'A', "A12");
        Employee employee1 = new Employee("Elizabeth", 'F', LocalDate.of(2011, 12, 2), "A23", "Math Teacher", 120000);
        President president1 = new President("Daniel", 'M', LocalDate.of(1980, 12, 1),LocalDate.of(2020, 1, 1));
        Teacher teacher1 = new Teacher("Emily", 'F', LocalDate.of(1985, 11, 1), "Math Teacher", "C1", 95000);

        System.out.println(student1);
        System.out.println(employee1);
        System.out.println(president1);

        student1.study();
        employee1.work();
        president1.lie();

        student1.eat("Sandwich");
        employee1.drink("Coffee");
        System.out.println("---------------------------------------------------");

        student1.eat("Baklava");
        teacher1.eat("Kebab");
        president1.eat("Donut");

        student1.drink("Milk");
        teacher1.drink("Tea");
        president1.drink("Coffee");


    }
}
