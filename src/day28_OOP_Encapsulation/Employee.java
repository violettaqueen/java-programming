package day28_OOP_Encapsulation;

public class Employee {

    private String name;
    private double salary;

    /**
     * getter method:
     * - no parameters, because it returns a value of private variable
     */

    public String getName() {
        return name;
    }

    /**
    - setter method:
    - need parameter,
     */

    public void setName(String name){
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if(salary <= 0){      // set condition before
            System.err.println("Invalid salary: " + salary);
            System.exit(0);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
