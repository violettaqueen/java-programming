package replit;

import java.util.Scanner;

public class Sandwich {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = input.next();
        String bread = "";
        String result = "";
       int startBread = str.indexOf("bread");
       String str1 = str.substring(0,startBread + 5);
       int endBread = str.lastIndexOf("bread");
       int length = str.length();
       String str2 = str.substring(str.length()-5);
       str2.substring(length - str1.length());
        System.out.println(str1);


        if(startBread == endBread){
         result= str.substring(startBread, endBread);

        }else{
            result = "Nothing";
        }
        System.out.println(result);
    }

}
