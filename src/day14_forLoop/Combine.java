package day14_forLoop;

public class Combine {

    public static String combine1(String str1, String str2){

        String result;

        if(str1.charAt(str1.length()-1)== str2.charAt(0) ){
    // if the last character in the first string is equal to a first character of the second string
    result = str1 + str2.substring(1); //first char of the second string should be excluded
        }else{
            result = str1 + str2;
        }
return result;
    }

}
