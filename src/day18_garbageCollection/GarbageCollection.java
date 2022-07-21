package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {

       // new GarbageCollection().finalize();  ===> we don't call this method, garbage collector calls it

        String s1 = "Java";
        s1 = null; // "Java" will be eligible for garbage collection

        System.out.println(s1);

        //  System.out.println(s1.toUpperCase());

        //  System.out.println( s1.replace(null, "Python"));

        String a = ""; // it's an object
        String b = null; // not an object

        System.out.println("-------------------------------------------");

        String str1 = "Python";
        str1 = "CYDEO";

        System.out.println(str1);


        System.out.println("-------------------------------------------");

        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "Chow chow", 'M', 3, "Medium", "Black");
        // dog1 = null;


        Dog dog2 = new Dog();
        dog2.setInfo("Chuck", "Bulldog", 'M', 5, "Small", "White");

        dog1 = dog2;

        System.out.println(dog1);
        System.out.println(dog2);


        // new Dog().finalize(); ===>  garbage collector calls method finalize


    }
}
