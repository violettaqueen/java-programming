package day25_constructor;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("S", 1,1);
        pizza1.calcCost();
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza("l", 2, 2);
        pizza2.calcCost();
        System.out.println(pizza2);
    }

}
