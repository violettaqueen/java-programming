package selfPractice.Encapsulation;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        if (!size.equalsIgnoreCase("small") && size.equalsIgnoreCase("medium") &&
                size.equalsIgnoreCase("large")){
            System.err.println("This size doesn't exist!");
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {

        if (numberOfCheeseTopping <= 0){
            System.err.println("Invalid number.Minimum number is 1");
            System.exit(1);
        }
        if (size.equalsIgnoreCase("small") && numberOfCheeseTopping >3) {
            System.err.println("Invalid number: Maximum number of cheese toppings is 3");
            System.exit(1);
        } else if (size.equalsIgnoreCase("medium") && numberOfCheeseTopping >4) {
            System.err.println("Invalid number: Maximum number of cheese toppings is 4");
            System.exit(1);
        } else if (size.equalsIgnoreCase("large") && numberOfCheeseTopping >5) {
            System.err.println("Invalid number: Maximum number of cheese toppings is 5");
            System.exit(1);
        }


        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {

        if (numberOfPepperoniTopping <= 0){
            System.err.println("Invalid number");
            System.exit(1);
        }
        if (size.equalsIgnoreCase("small") && numberOfPepperoniTopping >4) {
            System.err.println("Invalid number. Maximum number of pepperoni toppings is 4");
            System.exit(1);
        } else if (size.equalsIgnoreCase("medium") && numberOfPepperoniTopping >5) {
            System.err.println("Invalid number. Maximum number of pepperoni toppings is 5");
            System.exit(1);
        } else if (size.equalsIgnoreCase("large") && numberOfPepperoniTopping >6) {
            System.err.println("Invalid number. Maximum number of pepperoni toppings is 6");
            System.exit(1);
        }

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public double calCost(){

        double totalPrice = 0;

        double priceSmall = 10;
        double priceMedium = 12;
        double priceLarge = 14;


        switch(size){
            case "small":
                totalPrice = priceSmall + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case "medium":
                totalPrice = priceMedium + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;
            case "large":
                totalPrice = priceLarge + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                break;

        }
        return totalPrice;
    }

    public String toString() {
        return "Pizza {" +
                "size = '" + size + '\'' +
                ", numberOfCheeseTopping = " + numberOfCheeseTopping +
                ", numberOfPepperoniTopping = " + numberOfPepperoniTopping +
                ", Total cost = " + calCost() +
                '}';
    }
}
/*
Create class named Pizza:
                private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields
                        Conditions:
                            size of the pizza can only be small, medium, large. case insensitive

                            Number of cheese topping can not be negative, the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows user to set all the fields when the object is created.
                                (If the arguments not valid it should not be set to the instances)


                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping


 */