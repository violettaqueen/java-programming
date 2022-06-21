package selfPractice.DateTimePractice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllDates {

    public static void main(String[] args) {

        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList( LocalDate.of(2017, 1,1 )));



        dates.removeIf(p -> p.isBefore(LocalDate.of(2016, 8,15)));


        System.out.println(dates);


    }


}
/*
create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */