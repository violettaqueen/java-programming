package day04_concatenation;

public class SalaryCalculator {

    public static void main(String[] args) {

        String name = "Joshua";
        byte hourlyRate = 40;
        byte weeklyHours = 45;

        // salary = hourlyRate * weeklyHours * 52

        System.out.println(hourlyRate * weeklyHours * 52);

        System.out.println("Hello " + name + ", " + "your salary is $ 93600");

    }

}
