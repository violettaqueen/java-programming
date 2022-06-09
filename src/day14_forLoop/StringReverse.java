package day14_forLoop;

public class StringReverse {

    public static void main(String[] args) {


        String str = "Java";
        //0123
        // "avaJ"

        String name = "Violetta Queen";
        String result = reverse(name);
        System.out.println(result);

        String reverse = "";
        for (int i = 3; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        // last index
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String reverse(String str) {
        String reverse = "";  // to contain all the characters of the given string in reverse order

        for (int i = str.length() - 1; i >= 0; i--) { //i is index number of given string starting from last index to index zero
            reverse += str.charAt(i); // to get each character from a string start from last index to zero index
        }

            return reverse;
        }

}