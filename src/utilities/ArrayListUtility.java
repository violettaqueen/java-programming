package utilities;

import java.util.ArrayList;

public class ArrayListUtility {

    public static int firstUniqueElement(ArrayList<Integer> list) {  // need to overload

        int firstUniqueElement = 0;
        for (Integer element : list) {

            // int element = 1;
            int frequency = 0;

            for (Integer each : list) {
                if (each == element) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                firstUniqueElement += element;
                break;
            }
        }
        return firstUniqueElement;
    }
    public static String firstUniqueElementByIndex(ArrayList<String> list){

        String unique = "";
        for (String eachElement : list) {
            if(eachElement.indexOf(eachElement) == eachElement.lastIndexOf(eachElement)){
                unique += eachElement;
                break;
            }
        }
        return unique;
    }

}

