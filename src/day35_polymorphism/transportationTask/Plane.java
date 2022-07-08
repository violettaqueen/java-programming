package day35_polymorphism.transportationTask;

import day34_interface.AnimalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {

    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }
    public void land(){
        System.out.println("Plane " + getMake() + " " + getModel()+ " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() + " is flying" );
    }
}
/*
 Create an abstract sub class of Transpotation named Plane that implements Flyable

				non-abstract method:
					land()
 */