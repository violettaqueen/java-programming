package selfPractice.Interface.DeviceTask;

public abstract class Device {

    private final String brand, model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery;
    private static boolean hasPowerButton;

    static{
        hasPowerButton = true;
    }

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery) {
        if (brand == null || brand.isEmpty()){
            System.err.println("Brand " + getBrand() + " can not be null or empty");
            System.exit(1);
        }
        this.brand = brand;
        if (model == null || model.isEmpty()){
            System.err.println("Model " + getModel() + " can not be null or empty");
            System.exit(1);
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        this.size = size;
        setHasPowerButton(hasBattery);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
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
            System.err.println("Color " + getColor() + " can not be null or empty");
            System.exit(1);
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public static boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public static void setHasPowerButton(boolean hasPowerButton) {
        Device.hasPowerButton = hasPowerButton;
    }

}
