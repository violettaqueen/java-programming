package utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterface {

    // adding array[] elements to a list:

   Function<int[], List<Integer>> arrayToList = array -> {
       List<Integer> list = new ArrayList<>();
       for (int each : array) {
           list.add(each);
       }
       return list;

   };
}
