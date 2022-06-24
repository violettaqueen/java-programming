package selfPractice.Encapsulation;

public class TestPizza {

    public static void main(String[] args) {

        Pizza pizza1  = new Pizza("large", 5,6);

        pizza1.getSize();
        pizza1.getNumberOfCheeseTopping();
        pizza1.getNumberOfPepperoniTopping();
        pizza1.calCost();

        System.out.println(pizza1);
    }
}
