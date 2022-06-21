package day26_Static.StaticClass;

public class Car {

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;


    //inner class - nested class. Should access through the name of class Car

    public class CarEngine{

        public void method(){

            System.out.println(make);
            System.out.println(wheels);
        }


    }
    public static class StaticInnerClass{

        // if inner class is static - I don't need an object
        // new Car.StaticInnerClass(); - when I call this class
        // doesn't take instance variable
        // accepts only static members

    }

}
