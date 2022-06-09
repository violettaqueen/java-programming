package day17_customClass;

public class TestSalaryCalculator {

    public static void main(String[] args) {

        SalaryCalculator salaryCalculator1 = new SalaryCalculator();

        salaryCalculator1.hourlyRate = 75;
        salaryCalculator1.stateTaxRate = 6;
        salaryCalculator1.federalTaxRate = 5;
        salaryCalculator1.weeklyHours = 40;

        System.out.println(salaryCalculator1);
    }


}
