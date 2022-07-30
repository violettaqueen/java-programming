package utilities;

import java.time.LocalDate;

public class LocalDateTime {

    public static boolean bornOnLeapYear(int birthYear){

        return  LocalDate.of(birthYear,1,1).isLeapYear();
    }
}

