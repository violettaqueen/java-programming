package day31_Inheritance.VehicleTask;

public class Boat extends Vehicle{
    public Boat(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }
    public void sail(){
        System.out.println("Sailing " + getBrand() + " " + getModel());
    }



}
