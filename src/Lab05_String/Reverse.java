package Lab05_String;

public class Reverse {

    public static void main(String[] args) {

        String word = "Wooden Spoon"; // start from last index number to index 0
        String result = "";

        // to reverse the order

        for (int i = word.length()-1; i >= 0; i--) { //iterator should decrease by one
                                     //i > -1 - variant 2
            char each = word.charAt(i);// character starting from last char to first char
           // System.out.println(each);
            result += each; // comcate to new variable result

            System.out.println(result);
        }

    }

}
