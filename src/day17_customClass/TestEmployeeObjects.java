package day17_customClass;

public class TestEmployeeObjects {

    public static void main(String[] args) {

       Employee employee1 = new Employee();
       employee1.setInfo("Mike", 23, 'M',"Java Developer", 120000, "A12");

       Employee employee2 = new Employee();
       employee2.setInfo("Violetta", 36, 'F',"Java Developer", 130000, "A23");

       Employee employee3 = new Employee();
       employee3.setInfo("Nathan", 43, 'M', "Auditor", 200000, "$%F");

       // change data, you can't change it to setInfo
       employee1.age = 39;
       employee3.name = "Lucy";

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();
        employee2.work();
    }

}
