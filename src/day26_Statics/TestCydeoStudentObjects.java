package day26_Statics;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);


        // constructor set all the instance variables:

        CydeoStudent student1 = new CydeoStudent("Violetta", 32, 'F');
        CydeoStudent student2 = new CydeoStudent("Elizabeth", 20, 'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);



    }

}
