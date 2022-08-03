package replit.StringPractice;

public class CoverString {

    public static void main(String[] args) {
        String main = "hello hello";
        String coverMe = "ello";
        String result = "";


        String[] array = main.split(" ");

        for (String each : array) {
            if (each.contains(coverMe)) {
                String coverMe1 = "[" + coverMe.substring(0, coverMe.length()) + "]";
                result = each.replaceAll(coverMe, coverMe1);

            }else{
               result = "[" + main + "]";
            }
        }
        System.out.println(result);
    }
}
/*
The coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

to search and find each appearance of coverME within main

then surround it with square brackets [coverMe]

if you cannot find the coverME within main then just return whole main itself covered [main].

keep in mind that coverME value can be of any length.

Examples:

coverString("java methods", "me") ) ; ==> "java [me]thods"
coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
coverString("apples", "pears") ) ; ==> "[apples]"
 */