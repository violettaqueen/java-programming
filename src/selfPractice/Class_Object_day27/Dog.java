package selfPractice.Class_Object_day27;

public class Dog {
    public String breed, size;
    public char gender;
    public int age;
    public String color;
    public static int numberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;
    public boolean isFriendly;

    public Dog(String breed, String size, char gender, int age, String color, boolean isFriendly) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.isFriendly = isFriendly;
    }

    static {
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 0;
    }

    public void eat() {
        System.out.println(breed + " is eating dog food");
    }

    public void drink() {
        System.out.println(breed + " is drinking water");
    }

    public void sleep() {
        System.out.println(breed + " is sleeping 5 hrs");
    }

    public void play() {
        System.out.println(breed + " is playing a lot");
    }
    public void bark() {
        System.out.println(breed + " is barking loud");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
/*
Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */