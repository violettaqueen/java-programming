package day17_customClass;

public class Pizza {

    public char size; //attributes, instance variable
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public double calcCost() { //instance method to calculate each pizza, must have a pizza object to use this method
        double totalPrice = 0;       // first, find

        switch (size) {

            case 'S':  // whichever bloch matches
            case 's':
                totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            case 'M':
            case 'm':
                totalPrice = 12 + 2 * (numberOfPepperoniTopping + numberOfCheeseTopping);
                break;

            case 'L':
            case 'l':
                totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

            default:
                System.err.println("Invalid size: " +size);
        }
        return totalPrice;

    }  // calculate the total price of pizza, returns it as double

    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }
}






/*
1. Create a class named Pizza:
            Attributes:
                1. size
                2. numberOfCheeseTopping
                3. numberOfPepperoniTopping

            Actions:
                calcCost(): returns the total cost of the pizza
                toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */