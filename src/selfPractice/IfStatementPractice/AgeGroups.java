package selfPractice.IfStatementPractice;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 85;
        String result = "";

        if (age == 1 && age == 2) {
            result = "infant";
        } else if (age >= 3 && age <= 5) {
            result = "toddler";
        } else if (age >= 6 && age <= 9) {
            result = "kid";
        } else if (age >= 10 && age <= 12) {
            result = "pre-Teen";
        } else if (age >= 13 && age <= 17) {
            result = "teenager";
        } else if (age >= 18 && age <= 20) {
            result = "young adult";
        } else if (age >= 21 && age <= 39) {
            result = "adult";
        } else if (age >= 40 && age <= 49) {
            result = "young middle aged adult";
        } else if (age >= 50 && age <= 54) {
            result = "Middle-Aged Adult";
        } else if (age >= 55 && age <= 64) {
            result = " Very Young Senior Citizen";
        } else if (age >= 65 && age <= 74) {
            result = " Young Senior Citizen";
        } else if (age >= 75 && age <= 84) {
            result = " Senior Citizen";
        } else {
            result = "Old Senior Citizen";
        }
        System.out.println(result);
    }
}
/*
Create a class named AgeGroups, an integer variable named age is declared and given. write a
program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement
 */