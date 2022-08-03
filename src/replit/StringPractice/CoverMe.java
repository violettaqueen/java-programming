package replit.StringPractice;

public class CoverMe {

    public static void main(String[] args) {

        String main = "Certified Wooden Spoon";
        String coverME = "o";
        String result = "";

        if (! main.equals(coverME) && ! main.contains(coverME)) {
            String str = "[" + main + "]";
            System.out.println(str);
        } else {

            String str1 = "[" + coverME + "]";
            String str = main.replaceAll(coverME, str1);


            System.out.println(str);
        }


    }
}
/*
if (!main.equals(coverME)&&!main.contains(coverME)) {
            String str = "[" + main + "]";
            return str;
        } else {

            String str1 = "[" + coverME + "]";
            String str = main.replaceAll(coverME, str1);



        return str;
    }
 */