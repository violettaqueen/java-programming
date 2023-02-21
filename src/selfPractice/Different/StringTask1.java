package selfPractice.Different;

public class StringTask1 {

    public static void main(String[] args) {

        String word = "abcdefg"; //lowo
        int start = 0;
        int end = 7;

        System.out.println(substringByIndex(word, 3,7));

    }

    public static String substringByIndex(String str, int start, int end) {
        if (str.length()> 1 && str.length() < 101) {
            if (start > 0 && end > start){
                return str.substring(start, end);
            } else if (start == 0 && start > str.length()) {
                return str;
            }

            }
        return str;
        }


    }

//



