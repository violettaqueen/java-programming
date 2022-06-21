package day26_Static.StudentTask;

public class Student {

    // what an object should contain: -> declare attributes

    public String name; // instance variable to store different objects
    public int age;
    public char gender;
    public String id;

    // every time student object is created, add constructor:
    // also used to initialize any instance variables
    // should this.name keyword because local variable has the same name

    public Student(String name, int age, char gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

   // should display name of student, call this method through the object

    public void study(){
        System.out.println(name + " is studying");

    }


    // create to String method:

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }
}
/*
 Create a custom class named Student
            Attributes:
                name, age, gender, id

            Add a constructor that can set all the fields

            Methods:
                study()
                toString()
 */