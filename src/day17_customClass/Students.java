package day17_customClass;

public class Students {

    public String name;
    public int age;
    public String regNumber;
    public char gender;
    public char grade;
    public boolean isFullTime;


    public void setInfo(String name, int age, String regNumber, char gender, char grade, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.regNumber = regNumber;
        this.gender = gender;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }




    public void study() {
        System.out.println(name + " is studying");
    }


    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", regNumber='" + regNumber + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }
}

