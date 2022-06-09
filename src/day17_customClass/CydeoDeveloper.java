package day17_customClass;

public class CydeoDeveloper {

    public String firstName;
    public String lastName;
    public String state;
    public String city;
    public String group;

    public boolean recordFlipgrid(){
        return true;
    }
    public int attendingliveSessions(){
        return 100;
    }
    public boolean takingQuiz(){
        return true;
    }
    public void attendingMentorMeeting(){

    }


    public String toString() {
        return "CydeoDeveloper{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public void doingGroupStudy(){
        System.out.println("YES");


    }
}
