package day28_oop_Encapsulation.Encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {

        /*

        Employee employee1 = new Employee();
        employee1.setName("Violetta");    // have to call it through the setter
        employee1.setSalary(150000);

        System.out.println(employee1.getName()); // to read the name
        System.out.println(employee1.getSalary()); //always call this method
*/

        Employee employee1 = new Employee("Violetta", 37, "Senior Java Developer", 200000);

        System.out.println(employee1);



    }

}
