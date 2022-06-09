package selfPractice;

public class StringMethodPractice {

    public static void main(String[] args) {

        String name = "Josh Daniel";
        //             0123456789

        name.charAt(4); // this method gives you a character

        char ch = name.charAt(8);
        System.out.println(ch);
        System.out.println(name.length());

        // how to get a last index number, we need to subtract 1 from total length
        // first count how many characters the string has, then subtract 1 and you receive last inder number

        char lastChar = name.charAt(name.length()-1);  //to find a last character
        System.out.println(lastChar);

        // loop is repeating actions
        // for loop - if the iteration is known
        // while loop - if the iteration is unknown


        }


    }


