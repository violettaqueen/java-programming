package mentor_Sessions;

public class SentenceReverse {

    public static void main(String[] args) {


        String str = "How can mirrors be real if our eyes aren't real";

        String[] jadenCased = str.split(" ");
        String result = "";

        for (int i = 0; i < jadenCased.length; i++) {
            result += jadenCased[i].substring(0, 1).toUpperCase() + jadenCased[i].substring(1) + " ";
        }
        System.out.println(result);

    }
}
