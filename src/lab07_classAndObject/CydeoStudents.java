package lab07_classAndObject;

public class CydeoStudents {

    public String name;
    public int age;
    public char gender;
    public boolean isEmployed, isMarried;
    public String batch;
    public int group;
    public String programmingLanguage;

// set all the fields of the object
    public void setInfo (String name, int age, char gender, boolean isEmployed, boolean isMarried, String batch, int group, String programmingLanguage) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isEmployed = isEmployed;
        this.isMarried = isMarried;
        this.batch = batch;
        this.group = group;
        this.programmingLanguage = programmingLanguage;
    }

    // display the student info when the object
    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batch='" + batch + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }

    public void study(){

        System.out.println(name+ " is studing " + programmingLanguage);



    }
}
