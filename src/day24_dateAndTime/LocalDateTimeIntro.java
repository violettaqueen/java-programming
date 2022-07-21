package day24_dateAndTime;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {

    public static void main(String[] args) {

        // set when the new batch starts
        LocalDateTime starts = LocalDateTime.now();
        System.out.println(starts);

        // set when the batch ends
        LocalDateTime ends = LocalDateTime.of(2023, 5,24,11,0);
        System.out.println(ends);

        // to find out of what day of week today
        System.out.println(starts.getDayOfWeek());

        // what time now
        System.out.println(starts.getHour());


    }

}
