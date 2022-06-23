package day28_OOP_Encapsulation;

public class TestEmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setName("Violetta");    // have to call it through the setter
        employee1.setSalary(150000);

        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());

    }

}
