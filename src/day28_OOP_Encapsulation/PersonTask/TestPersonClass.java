package day28_OOP_Encapsulation.PersonTask;

public class TestPersonClass {

    public static void main(String[] args) {

        // 6 different objects - allocated in Java heap memory

        Person person1 = new Person("Violetta");
        Person person2 = new Person("Elizabeth", 10);
        Person person3 = new Person("Olga", 'F');
        Person person4 = new Person("Nate", "English");
        Person person5 = new Person("Galina", 34, 'F');
        Person person6 = new Person("Jon", 45, 'M', "Russian");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        // call static through class name:

        Person.planet = "Mars";

        // call the static method:

        Person.printPlanetName();

        person1.eat("Burger");

        person1.drink("Coffee");

        System.out.println(person1);

        person3.eat("Fish");

        System.out.println(person3);


    }
}

