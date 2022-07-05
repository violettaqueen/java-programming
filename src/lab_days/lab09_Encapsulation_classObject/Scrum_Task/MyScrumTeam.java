package lab_days.lab09_Encapsulation_classObject.Scrum_Task;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester[] testers = {
                new Tester("josh", 34,'M', "A1", "QA", 45),
                new Tester("Emily", 43,'F', "A12", "QA", 42),
                new Tester("Bella", 23,'F',"A23","QE",48),
        };

        Developer[] developers = {
                new Developer("Shukur", 28, 'M', "B1", "Front-End Developer", 50, "Java"),
                new Developer("Marika", 27, 'F', "B2", "Back-End Developer", 51, "Python"),
                new Developer("Umran", 30, 'F', "B3", "Full stack Developer", 55, "C#"),
                new Developer("Diana", 28, 'F', "B4", "Software Developer", 50, "Java")
        };

        ScrumTeam scrumTeam = new ScrumTeam("Bilal", "Hasan", "Lucy", 14);

        scrumTeam.addTester(testers);
        scrumTeam.addDeveloper(developers);

        System.out.println(scrumTeam);

        System.out.println("----------------------------------------------------------------------");

        System.out.println("Testers: ");

        for (Tester eachTester : scrumTeam.getTesters()) {
            System.out.println("\t" + eachTester.getName() + " : $" + eachTester.getSalary());
        }
        System.out.println("--------------------------------------------------------------------------");

        for (Developer eachDeveloper : scrumTeam.getDevelopers()) {
            System.out.println("\t" + eachDeveloper.getName() + " : $" + eachDeveloper.getSalary());
        }


    }
}
/*
create a class called MyScrumTeam:
            1. create an array of Testers
            2. create an array of developers
            3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */