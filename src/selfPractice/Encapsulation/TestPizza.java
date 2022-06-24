package selfPractice.Encapsulation;

public class TestPizza {

    public static void main(String[] args) {

        Pizza smallPizza = new Pizza("large", 5,6);

        smallPizza.getSize();
        smallPizza.getNumberOfCheeseTopping();
        smallPizza.getNumberOfPepperoniTopping();
        smallPizza.calCost();

        System.out.println(smallPizza);
    }
}
