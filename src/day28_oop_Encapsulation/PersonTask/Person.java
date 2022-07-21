package day28_oop_Encapsulation.PersonTask;

public class Person {

    /**
     * call them through the object
     */

    public String name;
    public int age;
    public char gender;
    public String language;

    /**
     * call through class
     */
    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOfHead;

    public Person(String name) {  // allows us to create a person object by setting the name of person
        this.name = name;
    }

    public Person(String name, int age) {  // overload constructor: to create an object with name & age
        this(name);                        // call constructor first!!!
        this.age = age;
    }

    public Person(String name, String language) { // allows us to create an object by setting name & language
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {  // allows us to create an object by setting name & gender
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this(name, age);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) {
        this(name, age, gender);
        this.language = language;
    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHead = 1;
        numberOfWings = 0;

    }

    public static void printPlanetName() {  // static: no instance members
        System.out.println("Planet name: " + planet);
    }

    public void eat(String food) {  // need to print name and food the person is eating. it has to be instance method
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {  // instance method because static doesn't accept instance variables
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {  // only include instance variable.
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet ='" + planet + '\'' +
                '}';
    }
}
/*
Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize name

			Add a constructor to initialize name and age

			Add a constructor to initialize name and language

			Add a constructor to initialize name and gender

			Add a constructor to initialize name, age and gender

			Add a constructor to initialize name, age, gender, language

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()

 */