package day35_polymorphism;



import day34_interface.AnimalTask.*;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Animals tiger = new Tiger("Sher Khan", "bengal", 'M', 5, "large", "Orange");

        tiger.eat();
        tiger.sleep();
        WildAnimal tiger1 = new Tiger("Sher Khan", "bengal", 'M', 5, "large", "Orange");
        tiger1.hunt();


    }

}
