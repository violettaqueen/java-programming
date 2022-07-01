package day32_final_keyword;

class CydeoStudent{

    public final void language(){
        System.out.println("Java programming");
    }


}











public class Final_Keyword extends CydeoStudent{

    public static void main(String[] args) {

         final char gender = 'M';

        System.out.println(gender);


       // gender = 'F';   ------> compile error

        System.out.println(gender);

        System.out.println("--------------------------------------------------------------------------------------");







    }


}
