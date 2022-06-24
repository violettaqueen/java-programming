package day28_OOP_Encapsulation.Encapsulation;

public class TestStudentObject {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setAge(25);

        System.out.println(student1.getAge());

      student1.setName("Violetta123"); // it's going the setter condition

        System.out.println(student1.getName());
    }
}
