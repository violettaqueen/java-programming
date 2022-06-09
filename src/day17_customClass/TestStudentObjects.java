package day17_customClass;

public class TestStudentObjects {

    public static void main(String[] args) {

        Students student1 = new Students();

        student1.name = "Violetta";
        student1.age = 18;
        student1.regNumber = "A112";

        System.out.println(student1);

        Students student2 = new Students();

        student2.name = "Nathan";
        student2.age = 26;
        student2.regNumber = "A113";

        System.out.println(student2);

        Students student3 = new Students();
        student3.name = "Karl";
        student3.age = 40;
        student3.regNumber = "A114";

        System.out.println(student3);


    }

}
