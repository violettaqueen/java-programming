package Lab05_String;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String sentence = "Java Java Java Java Python C# Ruby Java Java";

        int countJava = 0;

        //sentence.indexOf("Java") >= 0

        //while the sentence has word Java
        while(sentence.contains("Java")){
            //remove one Java at the time
            sentence = sentence.replaceFirst("Java", " ");
            //increase the number of Java by one
            countJava++;
        }
        System.out.println(countJava);

    }

}
