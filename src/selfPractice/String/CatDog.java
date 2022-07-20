package selfPractice.String;

public class CatDog {

    public static void main(String[] args) {

        String sentence = "caT dog dogG cAt";

        int countCats = 0;
        int countDogs = 0;

        for (int i = 0; i <= sentence.length(); i++) {
            if (i > sentence.length() - 3) {
                break;
            }

            if (sentence.substring(i, i + 3).equalsIgnoreCase("cat")) {
                countCats++;
            } else if (sentence.substring(i, i + 3).equalsIgnoreCase("dog")) {
                countDogs++;
            }
        }
        boolean catDog = countCats == countDogs;
        System.out.println(catDog);
    }


}

/*
2. write a program to print true if the string "cat" and "dog" appear the same number of times in
 the given sentence

            Ex:
                sentence = "caT dog dogG cAt"

                output:
                    true
 */