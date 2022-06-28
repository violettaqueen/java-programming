package day30_Inheritance.Types_of_Inheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee extends Person{

    private String employeeID, jobTitle;
    private double salary;

    public Employee(String name, char gender, LocalDate date_Of_birth, String employeeID, String jobTitle, double salary) {
        super(name, gender, date_Of_birth);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println(getName() + " is working");
    }
}
