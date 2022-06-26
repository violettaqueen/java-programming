package selfPractice.Encapsulation;

import java.util.Locale;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null) {
            System.err.println("Name has not been set");
            System.exit(1);
        }

        if (name.isEmpty() && name.isBlank()) {
            System.err.println("Name can not be empty or blank");
            System.exit(1);
        }

        boolean hasDigit = false;
        boolean specialCharacter = false;


        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;
            }
        }
        if (hasDigit) {
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }
        boolean startsWithLetters = false;

        if (Character.isLetter(name.charAt(0))) {
            startsWithLetters = true;
        } else {
            System.err.println("Invalid name");
            System.exit(1);
        }


        this.name = name;
    }


    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {

        if (unitPrice < 0) {
            System.err.println("Unit Price can not be negative");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity < 0) {
            System.err.println("Quantity can not be negative");
            System.exit(1);
        }

        if (name.equals("toilet paper")) {
            if (quantity > 1) {
                System.out.println("Unfortunately, you can't buy more then one");
                System.exit(1);
            }
        }
        this.quantity = quantity;
    }

    public double calCost() {
        return quantity * unitPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", quantity=" + getQuantity() +
                ", total cost =" + calCost() +
                '}';
    }
}


/*
create a class called Item
        private variables:
            name, unitPrice, quantity

        Encapsulate all the fields:
            Conditions:
                name can not be empty or blank
                name can not contain any special characters other than space
                name must start with letters
                unit price can not be negative
                quantity can not be negative
                if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcCost(): returns the total cost
            toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */