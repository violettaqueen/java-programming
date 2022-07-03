package day33_abstraction.AnimalTask;

import java.time.LocalDate;

public class Fish extends Animals{

    public Fish(String name, String breed, char gender, String size, String color, LocalDate dateOfbirth) {
        super(name, breed, gender, size, color, dateOfbirth);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating fish food");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping");
    }
}
