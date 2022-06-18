package day25_Constructor;

public class TestSalaryCalculator {

    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(25,40,4, 3);
        salary1.salary();
        salary1.stateTax();
        salary1.federalTax();
        salary1.salaryAfterTax();

        System.out.println(salary1);


    }

}
