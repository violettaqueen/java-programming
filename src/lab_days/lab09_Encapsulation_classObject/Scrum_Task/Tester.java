package lab_days.lab09_Encapsulation_classObject.Scrum_Task;

public class Tester {

    private String name;
    private int age;
    private char gender;
    private String employeeID;
    private String jobTitle;
    private double hourlyRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name: " + name);
            System.exit(1); // some error has occurred, terminate the program.
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 18) {
            System.err.println("Invalid age for the tester: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) { // to check if this argument is true;

        if ( !(gender == 'M' || gender == 'F')) { //invalid
            System.err.println("Invalid gender for tester: " + gender);
            System.exit(1);
        }
        this.gender = gender;
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

        if (jobTitle == null || jobTitle.isBlank() || jobTitle.isEmpty()) {
            System.err.println("Job title is not valid: " + jobTitle);
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) { // we have to check if this argument is valid!

        if (hourlyRate < 0) {
            System.err.println("Hourly Rate can not be negative");
            System.exit(1);
        }
        this.hourlyRate = hourlyRate;
    }

    public Tester(String name, int age, char gender, String employeeID, String jobTitle, double hourlyRate) {
        setName(name);  // benefit: set method checks the conditions
        setAge(age);
        setGender(gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setHourlyRate(hourlyRate);
    }

    public double getSalary() {  //instance method because we use instance variable
         return hourlyRate * 40 * 52;  //52 weeks in a year

    }
    public void testing(){
        System.out.println(name + " is testing Java codes");
    }

    public String toString() {
        return "Tester {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", gender = " + gender +
                ", employeeID = '" + employeeID + '\'' +
                ", jobTitle = '" + jobTitle + '\'' +
                ", annual salary = " + getSalary() +
                '}';
    }
}


/*
create a class named Tester
            Variables:
                name, age, gender, employeeID, jobTitle, hourlyRate

            Encapsulate all the fields
                Conditions for setting the fields:
                    1. name can not be set to null/empty/blank
                    2. age can not be less than 18
                    3. gender can only be set to 'M' or 'F'
                    5. jobTitle can not be set to null/empty/blank
                    6. hourlyRate can not be negative

            Add a constructor that can set all the fields when an object is created

            Methods:
                getSalary(): returns the annual salary
                testing()
                toString()

 */