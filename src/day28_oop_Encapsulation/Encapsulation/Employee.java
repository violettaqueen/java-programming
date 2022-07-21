package day28_oop_Encapsulation.Encapsulation;

public class Employee {

    private String name;
    private int age;
    private String jobTitle;
    private double salary;

    // create a constructor: USE SETTER METHOD!
    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name);  //this.name = name; -> we need this method to check conditions!!!
        setAge(age);    //1. check condition first
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    /**
     * getter method:
     * - no parameters, because it returns a value of private variable
     */

    public String getName() {

        if (name == null){
            System.err.println("Name has not been set");
            System.exit(1);
        }

        // I want to make a condition: name doesn't have digit, spaces, empty strings


        return name;
    }

    /**
    - setter method:
    - need parameter,
     */

    public void setName(String name){

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Employee can not be empty or blank");
            System.exit(1);
        }

        this.name = name;
    }

    public double getSalary() {
        return salary;
    } // READ

    public void setSalary(double salary) { //WRITE

        if(salary < 0){      // set condition before: Salary should never be negative
            System.err.println("Invalid salary: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        if (age < 16){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if (jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("Job title can't be empty or blank");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "Employee {" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
