package selfPractice.Different;

import java.util.Scanner;

public class AnimalDish {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);


            System.out.println("Enter animal name");
            String animalName = input.nextLine();

            System.out.println("Enter dish name");
            String dishName = input.nextLine();


            input.close();

            boolean result  = AnimalDish(animalName, dishName);
            System.out.println(result);



            //great blue heron ==> garlic naan
            //chickadee ==> chocolate cake

        }

        public static boolean AnimalDish(String dishName, String animalName){


            String firstIndexDish = dishName.substring(0,1);
            String lastIndexDish = dishName.substring(dishName.length()-1);
            String firstIndexAnimal = animalName.substring(0,1);
            String lastIndexAnimal = animalName.substring(animalName.length()-1);

            boolean first =  firstIndexDish.equals(firstIndexAnimal);
            boolean last = lastIndexDish.equals(lastIndexAnimal);
            if(first && last){
                return true;
            }else{
                return false;
            }


        }
    }



