package replit.ArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RepeatAll {

    public static void main(String[] args) {

        ArrayList<Boolean> list = new ArrayList<>(Arrays.asList(true, false, false));

        repeatAll(list);
        System.out.println(list);
    }

    public static void repeatAll(ArrayList<Boolean> list) {

        list.addAll(list);
        System.out.println(list);
    }

}



/*
Create a static method that:

is called repeatAll
returns ArrayList of Booleans
takes in a single parameter - an ArrayList of Booleans
This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is

(true, false, false)
The modified ArrayList should be

(true, false, false, true, false, false)
 */