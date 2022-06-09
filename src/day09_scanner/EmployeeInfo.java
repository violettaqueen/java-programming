package day09_scanner;
/*
Create a class named EmployeeInfo and Ask the user to:
        2.1 Enter your full name
        2.2 Enter your age (byte)
        2.3 Enter your gender (char)
        2.4 Enter your company name
        2.5 Enter your job title
        2.6 Enter your salary (double)

        Display:
            Employee's name
            EMployee's age
            Employee's gender
            Company name
            Employee's job title
            Employee's salary
 */
import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("2.1 Enter your full name:");
        String name = input.nextLine();

        System.out.println("2.2 Enter your age:");
        byte age = input.nextByte();

        System.out.println("2.3 Enter your gender:");
        char gender = input.next().charAt(0);

        input.nextLine();

        System.out.println("2.4 Enter your company name:");
        String company_name = input.nextLine();

        System.out.println("2.5 Enter your job title:");
        String job_title = input.nextLine();

        System.out.println("2.6 Enter your salary:");
        int salary = input.nextInt();


        System.out.println("Employee's name: " + name + "\n" + "Employee's age: " + age);
        System.out.println("Employee's gender: " + gender + "\n" + company_name);
        System.out.println("Employee's job title: " + job_title + "\n" + "Employee's salary: " + salary);

        input.close();
    }

}
