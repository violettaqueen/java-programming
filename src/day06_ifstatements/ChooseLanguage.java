package day06_ifstatements;

public class ChooseLanguage {

    public static void main(String[] args) {

        int num = 1;

        if(num == 1){
            System.out.println("Hello, thank you for your call");
        }
        if(num == 2){
            System.out.println("Hola, gracias para llamar");
        }
        if(num == 3){
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        }
        if(num == 4){
            System.out.println("Privet, spasibo za vash zvonok");
        }
        if (num == 5){
            System.out.println("Merci ,pour votre appel");
        }
    }

}
/*
4. Create a class named ChooseLanguage, Given an integer variable named selection that has a number between
 1~5, Write a program that can select the language based on the number that's given in selection and prints
 the following message:

		for 1: Hello, thank you for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement
 */