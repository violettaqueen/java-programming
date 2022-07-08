package day35_polymorphism.transportationTask;

public abstract class Car extends Transportation{

    public Car(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }
    public void drive(){
        System.out.println("Driving " + getMake() + " " + getModel());
    }

}
/*
Create an abstract sub class of Transpotation named Car

				extra methods:
					drive()

 */