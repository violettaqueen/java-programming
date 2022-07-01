package selfPractice.Custom_Methods;

public class CustomMethodsString {
    public static void main(String[] args) {
        emailDomain("violetta.v.queen@gmail.com");
        capitalization("vioLEtta", "quEEn");
        monthName(12);
        day(1);
        daysInMonth("April");
    }

    public static void emailDomain(String email) {


        String emailDomain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain: " + emailDomain);
    }

    public static void capitalization(String firstName, String lastName) {

        String fullName = "";
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println("Full name: " + firstName + " " + lastName);
    }

    public static void monthName(int monthNumber) {

        if (monthNumber >= 1 && monthNumber <= 12) {

            String monthName = (monthNumber == 1) ? "January" : (monthNumber == 2) ? "February" : (monthNumber == 3) ? "March" : (monthNumber == 4) ?
                    "April" : (monthNumber == 5) ? "May" : (monthNumber == 6) ? "June" : (monthNumber == 7) ? "July" : (monthNumber == 8) ?
                    "August" : (monthNumber == 9) ? "September" : (monthNumber == 10) ? "October" : (monthNumber == 11) ?
                    "November" : "December";
            System.out.println(monthName);
        } else {
            System.err.println("Invalid Number");
        }
    }

    public static void day(int numberDay) {

        if (numberDay >= 1 && numberDay <= 7) {

            String dayOfWeek = (numberDay == 1) ? "Monday" : (numberDay == 2) ? "Tuesday" : (numberDay == 3) ? "Wednesday" : (numberDay == 4) ?
                    "Thursday" : (numberDay == 5) ? "Friday" : (numberDay == 6) ? "Saturday" : "Sunday";
            System.out.println(dayOfWeek);
        } else {
            System.err.println("Invalid number");
        }

    }

    public static void daysInMonth(String monthName) {

        switch (monthName) {
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println(monthName + " has 30 days");
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println(monthName + " has 31 days");
                break;
            case "February":
                System.out.println(monthName + " has 28 days");
                break;
            default:
                System.out.println("Invalid month");
        }

    }
}
/*
5. Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days

 */
/*
4. Create a method named day that can display the name of the day based on the given number
 to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday

 */
/*
3. Create a method named monthName that can display the name of the month based on the given number to the method,
 if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */
/*
2. Create a method named capitalization that can format the first and last names of the person and display the full name of
 the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
 */
/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
 */