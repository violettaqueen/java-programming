package lab_Days.lab09_Encapsulation_classObject.Scrum_Task;

public class Test {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Violetta", 37,'F',"I27","Java SDET", 55);

        System.out.println(tester1);
        tester1.testing();

        Developer developer1 = new Developer("Violetta",38,'F', "I12","Senior Java Developer",
                90,"Java");
        System.out.println(developer1);

        developer1.coding();
        developer1.fixingBug();


    }

}
