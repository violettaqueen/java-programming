package selfPractice.StaticMethodPractice;

public class CydeoStudents {
    public String name;
    public int age;
    public char gender;
    public String id;
    public String grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";

    public CydeoStudents(String name, int age, char gender, String id, String grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public void study(){
        System.out.println(name + " is studying");
    }
    public void attendClass(){
        System.out.println(name + " is attending a class");
    }
    public static void printSchoolName(){
        System.out.println("School name is " + schoolName);
    }
    public static void printProgrammingLanguage(){
        System.out.println("programming language: " + programmingLanguage);
    }


    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade='" + grade + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
 CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */