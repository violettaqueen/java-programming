package day35_polymorphism;


import day29_Inheritance.AnimalTask.Animal;
import day34_interface.AnimalTask.*;
import day34_interface.CarTask.Tesla;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;

        Parrot parrot = null;

        Dolphin dolphin = null;

        Shark shark = null;

        Duck duck = null;


       // Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};

        /// Animal animal = new Tesla("Model Y", "Blue", 2022, 60000);
        // there is not "IS A" relationship between Animal and Tesla

        //Animal animal = new Dog("Max", "Husky", 'M', 4, "Small", "White");
//
//        animal.eat();
//        animal.drink();
//        animal.sleep();
//
//          animal.play();
//          animal.bark();






    }
}
