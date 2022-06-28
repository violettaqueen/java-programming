package day30_Inheritance.Types_of_Inheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student extends Person{

    private char grade;
    private String studentID;

    public Student(String name, char gender, LocalDate date_Of_birth, char grade, String studentID) {
        super(name, gender, date_Of_birth); // calling parent class constructor
        setGrade(grade);
        setStudentID(studentID);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void study(){
        System.out.println(getName()+ " is studying");
    }



}
