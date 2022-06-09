package day08_ternary_switch;
/*
Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:

			for 1: Hello, thank you for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
 */
public class ChooseLanguage {

    public static void main(String[] args) {

        int number = 2;
        String result = "";

        /* result = (number == 1)?"for1: Hello, thank you for your call"
                :(number == 2)? "for2: Hola, gracias para llamar" :(number == 3)?
                "for3: Merhaba, aradiginiz icin tesekkurler" :(number == 4)?
                "for4: Privet, spasibo za vash zvonok" :(number == 5)? "for5:Merci ,pour votre appel"
                : "Invalid";
        System.out.println(result);*/

        System.out.println("---------------------------------------");

        switch (number){
            case 1:
                System.out.println("for1: Hello, thank you for your call");
                break;
            case 2:
                System.out.println("for2: Hola, gracias para llamar");
                break;
            case 3:
                System.out.println("for3: Merhaba, aradiginiz icin tesekkurler");
                break;
            case 4:
                System.out.println("for4: Privet, spasibo za vash zvonok");
                break;
            case 5:
                System.out.println("for5:Merci ,pour votre appel");
            default:
                System.out.println("Invalid");

        }

    }

}
