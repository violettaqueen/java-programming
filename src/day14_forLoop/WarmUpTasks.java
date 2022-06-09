package day14_forLoop;

public class WarmUpTasks {

    public static String combine(String str1, String str2){

        String result;

        if(str1.endsWith("" + str2.charAt(0))) { //if the first string ends with the first character of the second string
            // empty string convert char to a string
        }else{
            result = str1 + str2;
        }
            result = str1 + str2.substring(1);
            return result;
    }

}
/*
Task1:
	    Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
	        combine("one", "eight")  ==> oneight

 */