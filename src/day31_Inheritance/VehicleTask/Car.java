package day31_Inheritance.VehicleTask;

public class Car extends Vehicle{ //child class must call parent class constructor
    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }
    public void drive(){
        System.out.println("Driving " + getBrand() +" "+ getModel());
    }





}
