package day30_Inheritance.Types_of_Inheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, char gender, LocalDateTime date_Of_birth) {
       setName(name);
       setGender(gender);
       setDate_Of_birth(date_Of_birth);
       setAge(LocalDate.now().getYear() - date_Of_birth.getYear());
    }

    private LocalDateTime date_Of_birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 0){
            System.err.println("Age can not be negative or zero");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDateTime getDate_Of_birth() {
        return date_Of_birth;
    }

    public void setDate_Of_birth(LocalDateTime date_Of_birth) {
        this.date_Of_birth = date_Of_birth;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", date_Of_birth=" + date_Of_birth +
                '}';
    }
}
