package lab_days.lab09_Encapsulation_classObject.Scrum_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {  //ScrumTeam class has a Tester

    private String PO;
    private String BA;
    private String SM;
    private ArrayList<Tester> testers = new ArrayList<>(); // we need an object
    private ArrayList<Developer> developers = new ArrayList<>();
    private int daysOfSprint; // every 10-15 days every Scrum team has a sprint

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        terminate(PO, "Invalid PO name");
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        terminate(BA, "Invalid BA name");
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        terminate(SM, "Invalid SM name");
        this.SM = SM;
    }

    public int getDaysOfSprint() {
        return daysOfSprint;
    }

    public void setDaysOfSprint(int daysOfSprint) {

        if (daysOfSprint <= 0) {
            System.err.println("Invalid days of Sprint: " + daysOfSprint);
            System.exit(1);
        }
        this.daysOfSprint = daysOfSprint;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    private static void terminate(String arg, String err) {

        if (arg == null || arg.trim().isEmpty()) {
            System.err.println(err);
            System.exit(1);
        }
    }

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
        setDaysOfSprint(daysOfSprint);
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }

    public void addTester(Tester[] testers) {
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void addDeveloper(Developer[] developers) {
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(String id) {
        testers.removeIf(p -> p.getEmployeeID().equals(id));
    }

    public void removeDeveloper(String id) {
        developers.removeIf(p -> p.getEmployeeID().equals(id));
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testers.size() + // to print how many testers
                ", developers=" + developers.size() +
                '}';
    }
}
/*
create a class called ScrumTeam
            Attributes:
                PO (String), BA (String), SM (String)
                testers (ArrayList<Tester>)
                developers(ArrayList<Developer>)
                daysOfSprint (int)

            Encapsulate the fields PO, BA, SM and daysOfSprint
                Conditions:
                  PO, BA, SM can not be null/empty/blank
                  days of sprint can not be 0 or negative

            Encapsulate tester and developers but ONLY generate getters
                (we do not set them by setters we will use add and remove functions instead)

            Add a constructor that can set the names of PO, BA and SM

            Methods:
                addTester(Tester tester): adds the given tester to the testers ArrayList

                addTester(Tester[] testers): adds the given testers to the testers ArrayList

                addDeveloper(Developer developer): adds the given developer to the developers ArrayList

                addDeveloper(Developer[] developers): adds the given developers to the developers ArrayList

                removeTester(long employeeID): removes the given tester from the testers ArrayList

                removeDeveloper(long employeeID): removes the developer from the developers ArrayList

                toString(): prints PO name, SM name, BA name, number of tester, and number of developers

 */