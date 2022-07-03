package day33_abstraction.AnimalTask;

import java.time.LocalDate;

public class Dog extends Animals{

    public Dog(String name, String breed, char gender, String size, String color, LocalDate dateOfbirth) {
        super(name, breed, gender, size, color, dateOfbirth);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping 6 hrs a day");
    }
    public void bark(){
        System.out.println("Dog " + getName()+ " is barking");
    }
}
