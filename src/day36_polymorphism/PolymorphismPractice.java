package day36_polymorphism;


import selfPractice.Inheritance.PhoneTask.IPhone;
import selfPractice.Inheritance.PhoneTask.Nokia;
import selfPractice.Inheritance.PhoneTask.Phones;
import selfPractice.Inheritance.PhoneTask.Samsung;

public class PolymorphismPractice {

    public static void main(String[] args) {

        Phones[] phones = {
                new IPhone("Iphone 11 Pro", "Large", 1000,"Pink"),
                new IPhone("Iphone 12 Pro Max", "Large", 1100, "Black"),
                new IPhone("Iphone 9", "Medium", 890, "White"),
                new Samsung("Galaxy S19", "Medium", 790, "Blue"),
                new Samsung("Galaxy S20", "Large", 999, "Pink"),
                new Samsung("Galaxy S21", "Large", 1090, "White"),
                new Nokia("XR20", "Small", 560, "White"),
                new Nokia("G10", "Medium", 670, "Black"),
                new Nokia("G50", "Large", 780, "Silver"),
                new IPhone("Iphone 12 Pro", "Large", 900, "Silver"),
                new IPhone("Iphone 11 Pro Max", "Large", 980, "White"),
                new Samsung("Galaxy S18", "Medium", 1000, "Black"),
                new Samsung("Galaxy S17", "Large", 1200, "White"),
                new Nokia("G10", "Medium", 1160, "Pink"),
                new IPhone("Iphone 6", "Smalle", 1120, "Pink"),
                new IPhone("Iphone 7", "Smalle", 980, "White")
        };

        // model - color - price



    }
}
