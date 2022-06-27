package day29_Inheritance.Encapsulation;

public class TestStudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Violetta", 37, 'F', 'A', "Cydeo" );

        // if some info is invalid, object will not be created!

        System.out.println(student1);

        // how to change school name if student move to a different school

        student1.setSchoolName("Harvard");

        // to change a student grade from A to B

        student1. setGrade('B');

        System.out.println(student1);

        // getter and setter(methods) do a security checks if conditions are met!!!
    }
}
