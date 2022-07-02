package day32_final_keyword;

import java.time.LocalDate;

class CydeoStudent{

    public final void language(){
        System.out.println("Java programming");
    }


}


public class Final_Keyword extends CydeoStudent{
    public Final_Keyword() {
    }

    public static void main(String[] args) {

         final char gender = 'M';

        System.out.println(gender);


       // gender = 'F';   ------> compile error

        System.out.println(gender);

        System.out.println("--------------------------------------------------------------------------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        //  dateOfBirth = dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth);

        System.out.println("-----------------------------------");

        new CydeoStudent().language();
        new Final_Keyword().language();

        System.out.println("-----------------------------------");

        final String name = "James";
        // name = null;
        // name = "Daniel";

        System.out.println(name);









    }


}
