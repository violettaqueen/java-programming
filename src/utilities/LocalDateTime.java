package utilities;

import java.time.LocalDate;
import java.util.ArrayList;

public class LocalDateTime {

    public static boolean bornOnLeapYear(int birthYear){

        return  LocalDate.of(birthYear,1,1).isLeapYear();
    }
    public static ArrayList<LocalDate> removeDates(ArrayList<LocalDate> list){

        list.removeIf(p -> p.isBefore(LocalDate.of(2016,8,15)));
        return list;
    }
}

