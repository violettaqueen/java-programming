package day28_OOP_Encapsulation.Encapsulation;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {

        if (name == null){
            return "Unknown";
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Name can not be blank or empty");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 100){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

if (gender != 'M' && gender != 'm' && gender != 'F'&&gender != 'f'){

        System.err.println("Invalid gender");
        System.exit(1);
    }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {

        if (dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Invalid Date");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}
/*
   Variables:

     name, age, gender, dateOfBirth

     Write : name: can not be null, empty or blank
     Read: if null is not, return "Unknown" instead

     age: age can not be less than zero or greater than 120

     gender:
     Write - gender can only be 'M' or 'F'

     dateOfBirth:
     write: can not be after today's date

     add a constructor, set all the fields : checks conditions

     toString();

 */