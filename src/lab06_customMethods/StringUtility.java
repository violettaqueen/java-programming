package lab06_customMethods;

public class StringUtility {

    //to find any word from any sentence

    public static int frequency(String sentence, String word) {

        int count = 0;

        for (int i = 0; i <= sentence.length() - word.length(); i++) {
            String each = sentence.substring(i, i + word.length());

            if (each.equals(word)) {
                count++;

            }


        }
        return count;

    }

    public static int frequency2(String sentence, String word) {
// return the frequency of the given word of the given sentence
        int count = 0;

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        return count;
    }

}








