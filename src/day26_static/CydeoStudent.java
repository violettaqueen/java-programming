package day26_static;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolName;
    public static String secretCode;


    // constructor helps to set these INSTANCE variables:
    // don't add static variables to constructor

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static{
        schoolName = "Cydeo";  // will be assigned ONE TIME ONLY (initialize) for all the objects
        secretCode = "Wooden Spoon"; // only runs ONE time
    }

    public String toString() {
        return "CydeoStudent {" +
                "name ='" + name + '\'' +
                ", age =" + age +
                ", gender =" + gender +
                '}';
    }
}
