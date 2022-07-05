package lab_days.lab07_classAndObject;

public class TestCydeoStudentObject {

    public static void main(String[] args) {

        CydeoStudents cydeoStudent1 = new CydeoStudents();
        cydeoStudent1.setInfo("Violetta", 25, 'F', true, true, "Java Developer", 3, "Java");

        System.out.println(cydeoStudent1);

        CydeoStudents cydeoStudent2 = new CydeoStudents();

        cydeoStudent2.setInfo("Nathan", 43, 'M', false,true,"Java Tester", 5, "Java");
        System.out.println(cydeoStudent2);


        System.out.println("---------------------------------------------------------");

        CydeoStudents student1 = new CydeoStudents();
        CydeoStudents student2 = student1;
        CydeoStudents student3 = student2;

        student3.setInfo("Violetta", 30, 'F', true, false, "Java", 12, "Java");
        System.out.println(student3);
        System.out.println(student1);
        System.out.println(student2);


            }
        }
