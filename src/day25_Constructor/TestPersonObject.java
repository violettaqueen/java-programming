package day25_Constructor;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Person person1 = new Person("Elizabeth", 23,'F', LocalDate.of(2011,12, 2), false, true);
        Person person2 = new Person("Violetta", 34, 'F', LocalDate.of(1984, 12, 1), true, false);
        Person person3 = new Person("Olga", 45, 'F', LocalDate.of(1962, 3,30), true, false);
        Person person4 = new Person("Jon", 47, 'M', LocalDate.of(1975, 2,5), true, true);
        Person person5 = new Person("Nathan", 43, 'M', LocalDate.of(1978, 3,4), false,true);

        person1.drink("water");
        person1.isSleeping(true);
        person1.eat("burger");

        System.out.println(person1);

    }

}
