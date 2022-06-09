package day04_concatenation;

public class EmployeeInfo {

    public static void main(String[] args) {

        String name = "Daniel", company_name = "Google Inc",
                job_title = "Software Developer";

        byte age = 28;
        String gender = "Male";
        int salary = 90000;

        System.out.println(name + " is" +" " + age + " years old, " + "gender is " + gender + ".");
        System.out.println(name + " works at" + " " + company_name + " as a " + job_title +".");
        System.out.println(name + " makes $ "+ salary + " per year." );

    }

}
