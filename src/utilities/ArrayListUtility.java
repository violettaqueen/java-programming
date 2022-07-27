package utilities;

import java.util.ArrayList;
import java.util.Arrays;

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
    public static ArrayList<String> removeDuplicates(ArrayList<String> list){

        ArrayList<String> nonDup = new ArrayList<>();

        for (String eachName : list) {

            if(nonDup.contains(eachName)){
                continue;
            }
            nonDup.add(eachName);
            list = nonDup;
        }
        return nonDup;

    }
    public static ArrayList<String> combineRs(String[] r1, String[] r2) {

        ArrayList<String> combineRs = new ArrayList<>();
        for (String each : r1) {
            combineRs.add(each.trim());
        }
        for (String each : r2) {
            combineRs.add(each.trim());
        }
        return combineRs;
    }
    public static ArrayList<String> removeEveryOther(ArrayList<String> words) {

        for (int i = 0; i < words.size(); i++) {  // words
            for (int j = 0; j < words.size(); j++) { // indexes
                if(i == j){
                    words.remove(i);
                }
            }
        }

        return words;
    }
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {

        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer eachNum : list) {

            if (eachNum > 0) {
                newList.addAll(Arrays.asList(eachNum));
            }
        }
        int sum = 0;
        for (Integer each : newList) {
            sum += each;
        }

        newList.add(newList.size() , sum);  // this statement out of loop

        return newList;
    }

}

