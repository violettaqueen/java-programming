package day28_OOP_Encapsulation.PersonTask;

public class Person {

    /**
    call them through the object
     */

    public String name;
    public int age;
    public char gender;
    public String language;

    /**
    call through class
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
        this(name,age);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) {
        this(name,age,gender);
        this.language = language;
    }
    static{

    }
}
