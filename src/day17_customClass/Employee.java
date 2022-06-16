package day17_customClass;

public class Employee {

    public String name; //instance variables
    public char gender;
    public String jobTitle;
    public double salary;
public int age;
    public String id;

    // sets all the attributes of the employee object at once
    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name; //argument
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;
    }//right click, constructor

    // need a two string method, to avoid

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }


    public void work() {
        System.out.println(name + " is working");
    }

    public void nameAndJobTitle(String name, String jobTitle) {
        System.out.println("name: " + name + "\n" + "Job Title: " + jobTitle);
    }
}