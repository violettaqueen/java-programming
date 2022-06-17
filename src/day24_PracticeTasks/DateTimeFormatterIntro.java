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
        System.out.println("--------------------------------------------------------------------------");

        // lunch break exercise:

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/y");
        LocalDateTime date2 = LocalDateTime.of(2022, 11,24,1,0);
        System.out.println(date2.format(dtf2));




    }

}
/*
1. use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020
 */