package selfPractice.Inheritance.PhoneTask;

import java.util.Arrays;

public class Phones {

    private String brand, model, size, color; // encapsulate the variable
    private double price;
    // constructor
    public Phones (String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (brand == null && brand.trim().isEmpty()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if (model == null && model.trim().isEmpty()){
            System.err.println("Invalid model");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0){
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if (color == null && color.trim().isEmpty()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink"};

        if (Arrays.asList(colors).contains(color)){
            this.color = color;
        }else{
            System.err.println("Invalid color: " + color + " color of the phone can only be: " + Arrays.toString(colors));
            System.exit(1);
        }

    }

    public void call(long phoneNumber){
        System.out.println(getModel() + " is calling " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(getModel() + " is texting " + phoneNumber);
    }

    public String toString() { // to be able to print objects
        return getClass().getSimpleName() + "{" + // call getClass method --> Object class in Java
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
/*
1. Create a named Phone:
				Variables:
					brand, model, size, price, color
				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}
				Add a constructor that can set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */
