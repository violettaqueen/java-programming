package selfPractice.Inheritance.EmployeeTask;

public class Developer extends Employee{

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        if (!(programmingLanguage.equalsIgnoreCase("Java") || programmingLanguage.equalsIgnoreCase("JavaScript") ||
        programmingLanguage.equalsIgnoreCase("Python") || programmingLanguage.equalsIgnoreCase(":Ruby")||
        programmingLanguage.equalsIgnoreCase("C#") || programmingLanguage.equalsIgnoreCase("C++")||
        programmingLanguage.equalsIgnoreCase("Swift"))){
            System.err.println("Invalid programming language: " + programmingLanguage);
        }
        this.programmingLanguage = programmingLanguage;
    }
    public void coding(){
        System.out.println(getName() + " is coding");
    }
}
/*
Create a custom Class named Developer

			Variables:
				name, gender, age, id, jobTitle, salary, programmingLanguage

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in the print statement
 */