package day33_abstraction.AnimalTask;

import java.time.LocalDate;

public class Cat extends Animals{

    public Cat(String name, String breed, char gender, String size, String color, LocalDate dateOfbirth) {
        super(name, breed, gender, size, color, dateOfbirth);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }
    public void meow(){
        System.out.println(getName()+ " is meowing");
    }
}
