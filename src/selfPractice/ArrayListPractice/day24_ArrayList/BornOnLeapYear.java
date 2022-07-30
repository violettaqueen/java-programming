package selfPractice.ArrayListPractice.day24_ArrayList;

import java.time.LocalDate;

public class BornOnLeapYear {

  public static boolean bornOnLeapYear(int birthYear){

      return  LocalDate.of(birthYear,1,1).isLeapYear();
  }
}
/*
8. Create a function that accepts an int argument birthYear, return true if the person was born on leap
year, otherwise return false
 */