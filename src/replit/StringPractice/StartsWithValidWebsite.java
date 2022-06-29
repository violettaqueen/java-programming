package replit.StringPractice;

public class StartsWithValidWebsite {

    public static void main(String[] args) {

        String website = "violettafitness.edu";

        boolean startsWith = website.startsWith("violetta");
        boolean endsWith = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov");
        boolean isValid = startsWith == endsWith;

        if (isValid){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }

    }
}
/*
1. write a program that can check if the given website is valid website or not
	            starts with: www.
	            ends with: .com, .edu, .gov

 */