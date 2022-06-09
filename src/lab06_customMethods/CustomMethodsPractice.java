package lab06_customMethods;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        String str1 = helloName("Bob"); // you can assign it to a variable or print statement
        System.out.println(helloName("Bob"));

        System.out.println("---------------------------------------------------------------");
        makeAbba("Hi", "bye");
        System.out.println(makeAbba("Hi", "bye"));

        System.out.println("----------------------------------------------------------------");
        extraEnd("Hello");
        System.out.println(extraEnd("Hello"));

        System.out.println("----------------------------------------------------------------");
        System.out.println(firstTwo("Hello"));

        System.out.println("------------------------------------------------------------------");
        System.out.println(withoutFirstAndLast("Hello"));
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";

    }

    public static String makeAbba(String a, String b) {
        String result = "";   // String result = a + b + b + a;
        result += a; //comcate first parameter
        result += b; //comcate second parameter
        result += b; //comcate first parameter
        result += a; //comcate second parameter
        return result;
    }

    public static String extraEnd(String str) {
        if (str.length() < 2) {
            return str;
        }
        String substring = str.substring(str.length() - 2);  //last 2 chars from string
        String result = substring.repeat(3); // repeat the substring 3 times and return concatenation

        return result;
    }

    public static String firstTwo(String str){

        if(str.length()<2){
            return str;
        }
        return  "" + str.charAt(0) + str.charAt(1); //need to convert to an empty string
    }

    public static String withoutFirstAndLast(String str){

        if(str.length() >= 3){
            return str.substring(1, str.length()-1); // return between first and last chars
        }else{
            return str;
        }

    }


    }


