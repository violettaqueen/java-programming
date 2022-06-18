package day24_DateAndTime;

import java.time.LocalDate;

public class Birthday {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1984, 12, 1);
        LocalDate today = LocalDate.now();
        int age = today.getYear() - birthday.getYear();

        if (birthday == today) {
            System.out.println("Happy birthday" + "\n" + "You are 29 years old now");
        } else {
            System.out.println("Today is not your birthday");
        }


    }
}
/*public static int birthday(LocalDate dateOfBirth ){


    LocalDate today = LocalDate.now();
    int age = today.getYear()-birthday.getYear();

    if(birthday==today){
        System.out.println("Happy birthday" + "\n" + "You are 29 years old now");
    }else{
        System.out.println("Today is not your birthday");
    }
}
}
/*
Create a function named birthday, that takes three int arguments:
  1. year
  2. month
  3. day

the function should be able to print the age and "Happy birthday" if today is the birthday
otherwise the function will print "Today is not your birthday".
      ex:
          birthday(1993, 6, 16);
      output:
            Happy Birthday
            You are 29 years old
 */