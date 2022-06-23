package day28_OOP_Encapsulation.Encapsulation;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("John",25,'M', LocalDate.of(1986,6,3));

        System.out.println(person1);

    }
}
