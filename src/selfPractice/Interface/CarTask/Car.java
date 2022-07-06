package selfPractice.Interface.CarTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private  String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make == null && make.isEmpty()){
            System.err.println("Invalid input: " + make);
            System.exit(1);
        }
        this.make = getClass().getSimpleName();
        if (model == null && model.isEmpty()){
            System.err.println("Invalid input: " + model);
            System.exit(1);
        }
        this.model= model;
        if (year < 1886){
            System.err.println("Invalid year : " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        if(price < 0){
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()){
            System.err.println("Invalid color: "+ color);
            System.exit(1);
        }
        this.color = color;
    }
    public abstract void start();
    public abstract void drive();
    public void stop(){
        System.out.println("Car " + getMake() + " is stopping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                " make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
