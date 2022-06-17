package day24_PracticeTasks;

import day17_customClass.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {

    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));

        //1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the
        //         dogs array to smallDogs arrayList

        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("Small"));// p - each element of array list, condition - if dog object size is equal to small
        System.out.println(smallDogs);

        //1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the
        //     dogs array to youngDogs arrayList

//        ArrayList<Dog> youngDogs = new ArrayList<>();
/*
        for (Dog dog : dogs) {
            if(dog.age <=4){
                youngDogs.add(dog);
            }

 */
        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));

        youngDogs.removeIf(p -> p.age > 4); //p - dog object
        System.out.println(youngDogs);
    }


}


        /*for (Dog dog : dogs) { // access all the dog elements in Dog class
            if(dog.size.equalsIgnoreCase("Small")){// then you will have access to
                smallDogs.add(dog);
            }
            System.out.println(smallDogs);
            // Variant 2 - add all dogs in arraylist and remove dogs that are not small


        }



    }



}
/*
1. Give the following array of dogs
            Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};
            dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
            dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
            dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
            dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
            dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
            dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

            Note: Dog class is imported from day17 package

        1.1 Create an arrayList named smallDogs, and add all the dog objects with the size of small from the
         dogs array to smallDogs arrayList

            Note: DO NOT use any loops

    1.2 Create an arrayList named youngDogs, and add all the dog objects with the age of 4 or less from the
     dogs array to youngDogs arrayList

            Note: DO NOT use any loops

    1.3 Create an arrayList named femaleDogs, and add all the dog objects with the gender of 'F' the dogs array to femaleDogs arrayList

            Note: DO NOT use any loops

    1.4 Create an arrayList named maleDogs, and add all the dog objects with the gender of 'M' the dogs
    array to maleDogs arrayList

            Note: DO NOT use any loops



 */