package replit.StringPractice;

public class HasJava {

    public static void main(String[] args) {

        String word = "Java is a programming language";

        int countJava = 0;
        int countPython = 0;

        if (word.length() > 10) {


            for (int i = 0; i < word.length() - 1; i++) {
                char each = word.charAt(i);

                if (each == word.charAt(word.indexOf("java") + 4) ) {
                    countJava++;
                }
                if (each == word.charAt(word.indexOf("python") + 6)) {
                    countPython++;
                }

            }
        }

        if (countJava == countPython) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }



    }



/*
        if (word.contains("java")))) || {
          boolean  hasJava = true;

        }else{
            hasJava = false;
        }
        System.out.println(hasJava);
*/

}

/*
if (word.equals(word.indexOf("java")) && word.startsWith("" + word.indexOf(0))){
      //      exists = true;
     //}else{
     //  exists = false;
    // }

Use String methods to check if the given word contains the text java, but not anywhere in the String.
The java text must be in either position 0 or position 1 of the String. If the text java appears in any
 other position it is not valid and is not considered to be found in the String. Output a boolean value,
  true or false.
Note: You won't be able to just use contains method
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

Ex:
  Input:
    javapython

  Output:
    true

Copied!
Ex:
  Input:
    cjavac++

  Output:
    true
Ex:
  Input:
    c#javaruby

  Output:
    false

  -> The 'java' is not in positions 0 or 1
 */