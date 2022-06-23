package mentor_Sessions;

public class DuplicateCounter {

    public static int duplicateCounter(String name) {
        int count = 0;
        String example = "";
        for (int i = 0; i < name.length(); i++) { //r
            char ch = name.charAt(i);
            count = 0;
            for (int j = 0; j < name.length(); j++) { //

                if (ch == name.charAt(j)) {
                    count++;
                }


            }
            if (count > 1 && (!example.contains(ch + ""))) {
                example += "" + ch;
            }
        }
        return example.length();
    }
}

/*
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits


Example:
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */