package day11_string;

public class StringMethods2 {

    public static void main(String[] args) {

        // replace
        String sentence = "I love Python, Python is the best programming language";
        sentence = sentence.replace("Python", "Java");

        System.out.println(sentence);

        // -------------------------------

        String word = "java";

        word = word.replace('a', 'e'); // "jeve"

        System.out.println(word);

        // replaceFirst

        String sentence2 = "I love Java, Java is cool";
        sentence2 = sentence2.replace("Java", "Python");
        System.out.println(sentence2);

        // replace first, just to replace one of the words

        String sentance3 = "Java is cool, Java is fun, Java is amazing";

        sentance3 = sentance3.replaceFirst(", Java", ", Python");
        System.out.println(sentance3);

        sentance3 = sentance3.replace(" Java ", ", Violetta ");
        System.out.println("sentance3 = " + sentance3);

        // substring() used to create sub values. Extract 1 word from a sentence
        // count index number first to extract word Java

        String sentence4 = "I love Java Programming";
        // index:           012345678910
        String languageName = sentence4.substring(7, 10 + 1);
        System.out.println(languageName);

        // ex 2 in order to include last character, always + 1

        String sentance5 = "Today is Sunday, tomorrow is Monday";
        //                  0123456789
        String today = sentance5.substring(9, 15); // 14 + 1
        System.out.println(today);

        // ex 3 change domain address

        String email = "Cydeo.School@yahoo.com";
        // index
        int beginning = email.indexOf("@") + 1; //regardless of what domain is
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);
        System.out.println(domain);

// --------------------------------------

        String sentance6 = "I love Java programming"; // extract Java programming
        // String r1 = sentance6.substring(7, sentance6.length()-1 + 1);
        String javaProgramming = sentance6.substring(7);
        System.out.println(javaProgramming);

        // ------------------------------------

        String sentance7 = "Today is Sunday, Tomorrow is Monday";
        String tomorrow = sentance7.substring(sentance7.lastIndexOf(" ")+1);
        // create the substring "Monday" from sentance7                     //last space
        // do not count any index numbers
        System.out.println(tomorrow);

        System.out.println("------------------------------------------------------------");

        // repeat() method - repeat a string for a given number of times
        String word3 = "Python";
        String result = word3.repeat(10);
        System.out.println(result); // result without space

        // with space

        String result1 = (word3 + " ").repeat(10);
        System.out.println(result1);



    }

}
