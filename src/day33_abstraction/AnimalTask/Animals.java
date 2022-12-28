package day33_abstraction.AnimalTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Animals {

    private String name, breed;
    private final char gender;
    private final int age;
    private String size;
    private String color;
    private final LocalDate dateOfbirth;

    public Animals(String name, String breed, char gender, String size, String color, LocalDate dateOfbirth) {
        setName(name);
        setBreed(breed);
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
        setSize(size);
        setColor(color);
        this.dateOfbirth = dateOfbirth;
        this.age = LocalDate.now().getYear() - dateOfbirth.getYear();
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        String[] sizes = {"large", "medium", "small", "tiny"};

        if (!Arrays.asList(sizes).contains(size)) {
            System.err.println("Invalid size: " + size);
            System.exit(1);
        }
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public abstract void eat();
    public abstract void sleep();
    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                " name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", date Of Birth=" + dateOfbirth +
                '}';
    }
}
