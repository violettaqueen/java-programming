package day26_static;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);


        // constructor set all the instance variables:

        CydeoStudent student1 = new CydeoStudent("Violetta", 32, 'F');
        CydeoStudent student2 = new CydeoStudent("Elizabeth", 20, 'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(CydeoStudent.schoolName); // not a good way to call a static member, that's why it's warning
        System.out.println(CydeoStudent.schoolName);

        System.out.println(CydeoStudent.secretCode);
        System.out.println(CydeoStudent.secretCode);



    }

}
