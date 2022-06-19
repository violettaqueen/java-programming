package day26_Statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        //  3.1 Create 5 Student objects

        Student student1 = new Student("Violetta", 23,'F', "12");
        Student student2 = new Student("Entisar", 34,'F', "123");
        Student student3 = new Student("Kadifa", 45,'F', "142");
        Student student4 = new Student("Elizabeth", 18,'F', "152");
        Student student5 = new Student("Shukur", 37,'M', "162");

        Student[] students = {student1, student2, student3, student4, student5};

        //  3.2 Create a StudentGroup object

        StudentGroup group1 = new StudentGroup("Java Turtles", 1);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);

        // remove student

        group1.removeStudent("123");

        // to iterate ArrayList

        for (Student each : group1.students) {
            System.out.println(each.name + " : " + each.id);
        }

        System.out.println(group1);

        StudentGroup group2 = new StudentGroup("Java Cheetahs", 2);
         // add students
        StudentGroup group3 = new StudentGroup("Java Lions", 3);
        StudentGroup group4 = new StudentGroup("Java Tigers", 4);

        StudentGroup[] groups = {group1, group2, group3, group4};





    }
}
/*
Create a class named TestObjects
            3.1 Create 5 Student objects
            3.2 Create a StudentGroup object
            3.3 Add all the student objets to the StudentsGroup object' students list

 */