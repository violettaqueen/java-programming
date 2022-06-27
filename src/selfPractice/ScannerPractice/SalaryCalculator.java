package selfPractice.ScannerPractice;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate: ");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours do you work weekly?");
        double weeklyHours = input.nextDouble();

        System.out.println("Enter your state tax in percentage:");
        double stateTaxRate = input.nextDouble() / 100;

        System.out.println("Enter federal tax: ");
        double federalTaxRate = input.nextDouble() / 100;

        double salary = hourlyRate * weeklyHours * 52;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - totalTax;

        System.out.println("Your salary is: " + salary);
        System.out.println("Your state tax is: " + stateTax);
        System.out.println("Your federal tax is: " + federalTax);
        System.out.println("Your total tax is: " + totalTax);
        System.out.println("Your net income is: " + netIncome);

        input.close();
    }
}
/*
Crreate a class named SalaryCalculator:
		- Ask the user to enter his/her hourlyRate
        - Ask the user how many hours he/she works in a week
        - Ask the user to enter state tax (in percentage)
        - Ask the user to enter federal tax (in percentage)

         -Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */