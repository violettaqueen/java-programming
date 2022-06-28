package day30_Inheritance.Types_of_Inheritance;

import java.time.LocalDateTime;

public class Teacher extends Employee {

    public Teacher(String name, char gender, LocalDateTime date_Of_birth, String employeeID, String jobTitle, double salary) {
        super(name, gender, date_Of_birth, employeeID, jobTitle, salary);
    }

    public void teach(){
        System.out.println(getName() + " is teaching");
    }

}
