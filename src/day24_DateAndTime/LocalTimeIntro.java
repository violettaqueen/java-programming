package day24_DateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime starting_time = LocalTime.of(10,30);
        System.out.println(starting_time);

        // current time
        LocalTime current_time = LocalTime.now();
        System.out.println(current_time);

        System.out.println("------------------------------------------------------------");

        // max numbers are 23 hrs, 59 minutes, 59 seconds
        LocalTime time1 = LocalTime.of(23, 59);

        time1 = time1.plusHours(1);
        System.out.println(time1);

        time1 = time1.minusMinutes(55);
        System.out.println(time1);

    }

}
