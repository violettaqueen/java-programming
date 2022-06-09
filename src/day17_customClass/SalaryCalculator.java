package day17_customClass;

public class SalaryCalculator {

    public int hourlyRate;
    public double stateTaxRate;
    public double federalTaxRate;
    public int weeklyHours;

    public void setInfo(int hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
        double salary = hourlyRate * weeklyHours * 52;
        return salary;
    }
    public double stateTax(){
        double StateTax = stateTaxRate/100;
        return StateTax;
    }

    public double federalTax(){
        double federalTax = federalTaxRate/100;
        return federalTax;
    }
    public double salaryAfterTax (){
        double salaryAfterTax = (salary()* federalTax()) - (salary() * stateTax());
        return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", salaryAfterTax=" + salaryAfterTax() +

                '}';
    }
}

