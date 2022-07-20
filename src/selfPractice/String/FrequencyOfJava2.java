package selfPractice.String;

public class FrequencyOfJava2 {

    public static void main(String[] args) {

        String str = "My favorite programming language is Java, I love jAva, JAVA is so cool";
        str = str.toLowerCase();

        int frequency = 0;

        while(str.contains("java")){
            str = str.replaceFirst("java", "violetta");
            frequency++;
        }
        System.out.println(frequency);

    }
}
