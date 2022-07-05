package lab_days.Lab05_String;

public class StringMethodPractice {

    public static void main(String[] args) {

        String name = "Violetta Queen";
        name.charAt(4);
        char ch = name.charAt(4);
        System.out.println(ch);

        // to get last index number: total number of characters subtract 1

        char lastChar = name.charAt(name.length()-1);

                //without the index number, it will never complete its task.
        //you need provide last Index Number as an argument
        System.out.println(lastChar);


    }

}
