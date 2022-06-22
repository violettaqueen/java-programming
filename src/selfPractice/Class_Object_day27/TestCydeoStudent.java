package selfPractice.Class_Object_day27;

public class TestCydeoStudent {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Violetta",'F',23,"A12",3,"Java");

        System.out.println(student1);
        student1.study();
        student1.attendClass();
        CydeoStudent.printSchoolName();
        CydeoStudent.printSecretCode();





    }
}
