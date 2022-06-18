package day25_Constructor;

public class SalaryCalculator {
    public int hourlyRate;
    public int weeklyHours;
    public double stateTaxRate;
    public double federalRate;

    public SalaryCalculator(int hourlyRate, int weeklyHours, double stateTaxRate, double federalRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalRate = federalRate;
    }
    public double salary() {
        double salary = hourlyRate * weeklyHours * 52;
        return salary;

    }
    public double stateTax(){
        double stateTax = stateTaxRate / 100;
        return stateTax;
    }
    public double federalTax(){
        double federalTax = federalRate / 100;
        return federalTax;
    }
    public double salaryAfterTax(){
        double salaryAfterTax = (salary() * federalTax() - (salary()* stateTax()));
        return salaryAfterTax;
    }


    public String toString() {
        return "SalaryCalculator{" +
                "Salary=" + salary() +
                ", State tax =" + stateTax() +
                ", Federal tax=" + federalTax() +
                ", Salary after tax=" + salaryAfterTax() +
                '}';
    }
}
/*
  Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the totalStateTax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */