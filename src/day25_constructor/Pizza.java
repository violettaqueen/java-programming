package day25_constructor;

public class Pizza {


    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price =" + calcCost() +
                '}';
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;


    }
    public double calcCost(){
        double totalPrice =0;

        switch(size){
            case "S":
            case "s":
                totalPrice = 10 + 2 * (numberOfCheeseTopping +  numberOfPepperoniTopping);
                break;
            case "M":
            case "m":
                totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case "L":
            case "l":
                totalPrice = 14 + 2* (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
        }
        return totalPrice;
    }
}
/*
    Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping

 */