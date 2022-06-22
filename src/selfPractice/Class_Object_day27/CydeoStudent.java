package selfPractice.Class_Object_day27;

public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public String batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String fieldOfStudy;
    public String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, String batchNumber, int groupNumber, String programmingLanguage) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.programmingLanguage = programmingLanguage;
    }
    static{
        schoolName = "Cydeo";
        fieldOfStudy = "Programming";
        secretCode = "Wooden Spoon";
    }
    public static void printSchoolName(){
        System.out.println("School name: " + schoolName);
    }
    public static void printSecretCode() {
        System.out.println("Secret code: " + secretCode);
    }
    public void attendClass(){
        System.out.println(name + " is attending class");
    }
    public void study(){
        System.out.println(name + " is studying");
}

    public String toString() {
        return "CydeoStudent {" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", school name ='" + schoolName + '\'' +
                ", field of study ='" +fieldOfStudy + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
/*
create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()

 */