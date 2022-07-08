package lab_days.lab11_inheritance_abstraction;

public final class BusinessAnalyst extends Employee implements ScrumMember, WFH{

    public BusinessAnalyst(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is gathering the requiring information");
    }
    public void analyze(){
        System.out.println(getName()+ " is analyzing the requirements");
    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void sprintPlanning() {

    }

    @Override
    public void workFromHome() {

    }
}
