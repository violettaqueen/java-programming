package selfPractice.IfStatementPractice;

public class NetIncomeCalculator {

    public static void main(String[] args) {

        double salary = 140000;
        double totalTax = 0;
        boolean isMarried = false;
        double taxRate = 35;

        if (salary >= 130000) {
                    totalTax = salary * (taxRate / 100);
        }
        if (salary >= 100000 && salary <= 129000) {
            totalTax = salary * (taxRate / 100);
        }
        if (salary >= 80000 && salary <= 99000 ) {
            totalTax = salary * (taxRate / 100);
        }
        if (salary <= 79000) {
            totalTax = salary * (taxRate / 100);
        }
        if (isMarried) {
            totalTax = salary * (taxRate / 100 - 0.05);
        }
        double salaryAfterTax = salary - totalTax;
        double netIncome = salary - totalTax;

        System.out.println("Salary: " + salary + "\n" + "Total tax: " + totalTax + "\n" + "Salary after tax: " + salaryAfterTax + "\n" + "Net income: " + netIncome);


    }
}
/*
Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on
 the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax
 */