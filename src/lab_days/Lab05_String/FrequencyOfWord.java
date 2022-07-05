package lab_days.Lab05_String;

public class FrequencyOfWord {

    public static void main(String[] args) {

        /*String sentence = "Java Java Java Java Python C# Ruby";

        // different approach - word has 4 chars,
        // creat a temp value

        String temp = sentence; //"Java Java Java Java Python C# Ruby";
        // first: how many chars in sentence

        int original_length = sentence.length();

         temp = temp.replace("Java", "aaa");//"aaa aaa aaa aaa Python C# Ruby";

        int new_length = temp.length();

        System.out.println(original_length);
        System.out.println(new_length);

        int totalNumberOfJava = original_length - new_length;
        System.out.println(totalNumberOfJava);
*/
        String sentence = "Java Java Java Java Python C# Ruby";
        String temp = sentence.replace("Java", "abc");
        System.out.println(sentence);

    }

}
