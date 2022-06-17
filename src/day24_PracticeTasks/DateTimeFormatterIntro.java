package day24_PracticeTasks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

       DateTimeFormatter df =DateTimeFormatter.ofPattern("MMMM-dd-yy, EEEE"); //as a string

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df)); //return type string

        LocalDate date1 = LocalDate.of(2022,6,12);
        System.out.println(date1.format(df)); //July-01-22

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time1 = LocalTime.of(7,5);
        System.out.println(time1.format(tf));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MM/dd/y  hh:mm a");
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts.format(dtf));


    }

}
