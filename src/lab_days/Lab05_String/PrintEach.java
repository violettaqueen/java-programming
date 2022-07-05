package lab_days.Lab05_String;

public class PrintEach {

    public static void main(String[] args) {

        String word = "Wooden Spoon"; //get each character from a string

        // String word = new Scanner(System.in).nextLine();
        /*
        System.out.println(word.charAt(0)); // first char
        System.out.println(word.charAt(1)); // second char
        */

        for (int i = 0; i <= word.length()-1 ; i++) { // the last index number of string
                         // < word.length() - variant 2, i ++ every index num increased by 1 every single time
            char each = word.charAt(i);
            System.out.println(each);
        }

    }

}
