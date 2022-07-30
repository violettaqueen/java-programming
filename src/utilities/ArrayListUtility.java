package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
    public static ArrayList<Integer> uniqueElements(ArrayList<Integer> list){

        list.removeIf(p -> Collections.frequency(list, p) > 1);
        return list;
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
    public static ArrayList<String> combineTwoArrays(String[] arr1, String[] arr2){

        ArrayList<String> list = new ArrayList<>(Arrays.asList(Arrays.toString(arr1)));
        list.add(Arrays.toString(arr2));
        return list;
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
    public static ArrayList<Integer> combineAll(ArrayList<Integer> numbersOne, ArrayList<Integer> numbersTwo){

        ArrayList<Integer> list = new ArrayList<>();

        for (Integer eachNumber1 : numbersOne) {
            list.addAll(Arrays.asList(eachNumber1));
        }
        for (Integer eachNumber2 : numbersTwo) {
            list.addAll(Arrays.asList(eachNumber2));
        }

        return list;
    }
    public static ArrayList<Integer> removeElements(ArrayList<Integer> list){

        list.removeIf(p -> p < 4);
        return list;
    }
    public static ArrayList<Integer> setLastElement(ArrayList<Integer> list, int element){

        list.set(list.size()-1, 0);
        return list;
    }
    public static ArrayList<String> removeAllSpecificNames(ArrayList<String> list, String name){

        list.removeAll(Arrays.asList(name));
        return list;
    }
    public static ArrayList<Integer> duplicateElements(ArrayList<Integer> list){

        list.addAll(list);
        return list;
    }
    public static int nthLargestNumber(ArrayList<Integer> list, int n) {

        for (int i = 1; i < n; i++) { // i: elements
            list.removeIf(p -> Collections.max(list) == p);
        }
        return Collections.max(list);
    }
    public static ArrayList<Integer> moveAllZeros(ArrayList<Integer> list){

        // count zeros:
        int countZeros = Collections.frequency(list, 0);

        // remove all zeros:
        list.removeAll(Arrays.asList(0));

        // add zeros to the end of list:
        for (int i = 0; i < countZeros; i++) { // indexes
            list.add(0);
        }
        return list;
    }
    public static ArrayList<Integer> multiplyOddNumbersBy2(ArrayList<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 !=0){
                list.set(i, list.get(i) *2);
            }
        }
        return list;
    }
    public static ArrayList<Integer> multiplyEvenNumberBy2(ArrayList<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 == 0){
                list.set(i, list.get(i)*2);
            }
        }
        return list;
    }
    public static ArrayList<Character> retrieveCharacters(String str){

        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();

        for (char each : str.toCharArray()){
            if(Character.isDigit(each)){
                list1.addAll(Arrays.asList(each));
            } else if (Character.isUpperCase(each) && Character.isLetter(each)) {
                list2.addAll(Arrays.asList(each));
            }else{
                list3. addAll(Arrays.asList(each));
            }
        }
        list.addAll(list1);
        list.addAll(list2);
        list.addAll(list3);

        return list;
    }

}

