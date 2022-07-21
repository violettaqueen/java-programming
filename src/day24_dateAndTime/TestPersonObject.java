package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {

    public static void main(String[] args) {

        // to store multiple person objects, we can use Array, and ArrayList

        // in this array I can store a person object
        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Violetta", 'F', LocalDate.of(1984, 12,1));
        people[1].setInfo("Elizabeth", 'F', LocalDate.of(2011, 12,2));
        people[2].setInfo("Nathan", 'F', LocalDate.of(1978, 4,3));
        people[3].setInfo("Olga", 'F', LocalDate.of(1962, 3,30));
        people[4].setInfo("Sofia", 'F', LocalDate.of(2001, 10,2));

        ArrayList<Person> studentList = new ArrayList<>();

        // need to convert to array to arrayList

        studentList. addAll(Arrays.asList(people));

        // print name and date of birth of each person object

        for (Person eachPerson : people) {
            System.out.println(eachPerson.name + ", " +eachPerson.dateOfBirth);
        }

        // remove all the person object that has the age > 23
        studentList.removeIf(p -> p.age > 23);
        System.out.println(studentList);


        }

    }


