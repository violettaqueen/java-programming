package selfPractice.String;

public class FrequencyOfJava {

    public static void main(String[] args) {

        String str = "My favorite programming language is Java, I love jAva, JAVA is so cool";


        int frequency = 0;


        for (int i = 0; i < str.length(); i++) {

            if(i > str.length() -4){
                break;
            }
            if(str.substring(i, i+4).toLowerCase().contains("java")){
                frequency++;
            }
        }



        System.out.println(frequency);
    }
}
/*
1. Write a program that can return the frequency of the word java from a sentence
    Ex:
        sentence = "My favorite programming language is Java, I love jAva, JAVA is so cool"

    output:
        3
 */