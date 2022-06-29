package day11_string;

public class StringMethods3 {

    public static void main(String[] args) {

// isEmpty - if a string is empty, then it returns you true or false.
        // Empty means = 0

        String word = "Wooden Spoon";
        boolean r1 = word.isEmpty();
        System.out.println(r1);

        String word1 = "";
        boolean r2 = word.isEmpty();
        System.out.println(r2);

        // blank() method

        String str = "       ";
        boolean r3 = str.isEmpty();
        boolean r4 = str.isBlank();
        System.out.println(r4);
        System.out.println(r3);

        // equals() method, used a lot more to compare values of two strings

        String str1 = "Cydeo";
        String str2 = new String("Cydeo");
        System.out.println(str1.equals(str2));

        // equalsIgnoreCase - to compare same words, doesn't matter lower or upper case
        String s1 = "JAVA";
        String s2 = "java";
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2));  // true

        // contains() method

        String students = " Hasan Naran Violetta Jon"; //I want to verify if Ahmet contain here
        boolean hasAhmet = students.contains("Ahmet");
        System.out.println(hasAhmet);
        boolean violetta = students.contains("Violetta");
        System.out.println(violetta);

        // how to ignore case sensetivity
        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("java");
        System.out.println(hasJava);

        // startsWith() method

        String name = "Michael";
        boolean l = name.startsWith("D");
        System.out.println(l);

        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www.");
        System.out.println(isValid);

        // endsWith() method

        boolean t = url.endsWith(".com");
        System.out.println(t);

        String email = "cydeo@gmail.com"; // to verify if gmail is true
        boolean isGmail = email.endsWith("gmail.com");
        System.out.println(isGmail);
        boolean isYahoo = email.endsWith("yahoo.com");
        System.out.println(isYahoo);







    }

}
