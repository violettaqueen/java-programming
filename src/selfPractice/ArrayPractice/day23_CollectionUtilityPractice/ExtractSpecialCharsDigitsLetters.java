package selfPractice.ArrayPractice.day23_CollectionUtilityPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractSpecialCharsDigitsLetters {

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

    public static void main(String[] args) {

       String str = "ABCD123$%#@&456EFG!";

        System.out.println(retrieveCharacters(str));
    }
}
