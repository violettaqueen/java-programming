package lab_days.lab07_classAndObject;

public class Car {

    public String brand, model;
    public int year;
    public String color;
    public double price;

    public void setInfo(String brand, String model, String color,
                        int year, double price){
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.price = price;
        this.model = model;
    }

    public String toString() {
        return year + " " + brand + " " + model + " " + color + ", $" + price;
    }

        public void drive(){
            System.out.println("Driving " + brand + " " + model);
        }

    }


