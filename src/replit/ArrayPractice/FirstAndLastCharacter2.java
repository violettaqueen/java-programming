package replit.ArrayPractice;

public class FirstAndLastCharacter2 {

    public static void main(String[] args) {

        String[] words = {"hello", "why", "by", "apple", "note", "violetta"};
        String first = "";

        for (int i = 0; i < words.length; i++) {

            System.out.print(""+(words[i]).charAt(0)+words[i].charAt(words[i].length()-1));
            System.out.println();
        }

    }


}

