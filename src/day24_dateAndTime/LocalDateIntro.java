package day24_dateAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        // if I want to print today's date

        LocalDate today = LocalDate.now(); // return local object
        System.out.println(today);

        // to create a different date, month, year, not now

        LocalDate birthday = LocalDate.of(1984, 12,1); // always number
        System.out.println(birthday);

        System.out.println("-------------------------------------------------------------------------");

        // this method gives current year
        System.out.println( today.getYear() );

        // getMonth() returns current name of month , like December
        System.out.println(today.getMonth());

        // getMonthValue() - return you a number of month, like 6, 10
        System.out.println(today.getMonthValue());

        // getDayOfWeek: Monday, Tuesday...
        System.out.println(today.getDayOfWeek());
        System.out.println(birthday.getDayOfWeek());

        // getDayOfMonth: return day Number between 1-12, integer
        System.out.println(today.getDayOfMonth());

        // getDayOfYear: return a number of day of the year, return int
        System.out.println(today.getDayOfYear());
        System.out.println("-------------------------------------------------------------------------");

        // plusYears() create a new local date objects, what date is one year from today's date
        System.out.println(today.plusYears(1)); //creates a new object
        today = today.plusYears(1); //updated the old variable

        LocalDate graduationDate = LocalDate.of(2025, 6, 4);
        graduationDate= graduationDate.plusYears(2); //2027-6-4 new object created, need to assign back to a variable
        System.out.println(graduationDate);

        // plusMonth()
        graduationDate = graduationDate.plusMonths(2);// add extra 2 months
        System.out.println(graduationDate);

        // plusWeeks()
        graduationDate = graduationDate.plusWeeks(7); //add extra 7 weeks
        System.out.println(graduationDate);

        // plusDays()
        graduationDate = graduationDate.plusDays(100);
        System.out.println(graduationDate);
        System.out.println("-------------------------------------------------------------------------------------");
        // minusYears() - reduce the number of years

        LocalDate yourBirthday = LocalDate.of(1984, 12, 1);
        LocalDate yourBrotherBirthday = yourBirthday.minusYears(2).minusMonths(3).minusDays(2);
        System.out.println(yourBrotherBirthday);

        // isEqual() - checks if two objects are equal, return boolean true or false
        LocalDate birthday1 = LocalDate.of(2011, 12,2);
        LocalDate birthday2 = LocalDate.of(1984, 12, 1);

        boolean compare = birthday1.isEqual(birthday2);
        System.out.println(compare);

        System.out.println("-----------------------------------------------------------");

        // isBefore returns boolean true, to verify is one date object is before another date object
        LocalDate grade_date = LocalDate.of(2023, 1,1);


        // to verify if a year is a leap year

        System.out.println(  grade_date.isBefore(  LocalDate.of(2022, 12, 31) ));
        System.out.println(  grade_date.isAfter(  LocalDate.of(2022, 12, 31) ));

        System.out.println("----------------------------------------------");

        System.out.println(  LocalDate.of(2022, 6, 16).isLeapYear()  );






    }

}
