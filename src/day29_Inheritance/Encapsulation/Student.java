package day29_Inheritance.Encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty()) {
            System.err.println("Invalid student name");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0) {
            System.err.println("Age can not be negative: " + age);  // first checked this condition
            System.exit(1);
        }
        if (age < 5 || age > 90) {
            System.err.println("Invalid age: " + age); // second compiler checks this condition
            System.exit(1);
        }
        this.age = age; // then assigning to an instance variable name
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (gender == 'M' || gender == 'F') { // if this condition is true;
            this.gender = gender;  // the variable will be set
        } else {
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {


        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public void study(){ //instance method
        System.out.println(name + " is studying at " + schoolName);

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' + // they already valid values and been checked by constructor
                ", age=" + age + // so not necessary to do getName etc
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName
            Encapsulate all the fileds (at leat encapsulate two fields manually)
                    requirments:
                        1. age can not be less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'
            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)
            Methods:
                study()
                toString()
 */