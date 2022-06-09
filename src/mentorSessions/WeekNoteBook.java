package mentorSessions;

public class WeekNoteBook {

    public static void main(String[] args) {

notebook(6,5);


    }

    public static void notebook (int week, int days){

        for (int i = 1; i < week; i++) {
            System.out.println("week: " +i);
            for (int j = 1; j < days; j++) {
                System.out.println("day:" + j);
            }
        }

    }
}
