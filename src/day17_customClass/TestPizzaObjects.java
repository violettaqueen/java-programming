package day17_customClass;

public class TestPizzaObjects {

    public static void main(String[] args) {  //to be able to run a class

        Pizza pizza1 = new Pizza(); //use new keyword to creat a string object

        /*pizza1.size = 'S';
        pizza1.numberOfPepperoniTopping = 1;
        pizza1.numberOfCheeseTopping = 2;
        */
        pizza1.setInfo('L',2,0);


        Pizza pizza2 = new Pizza();
        pizza2.setInfo('s', 2, 1);

        System.out.println(pizza1);
        System.out.println(pizza2);

        System.out.println("------------------------------------------------");

        // how to create 60 pizzas? creat a loop

        double total = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('s', 2, 2);
            total += small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('m', 3, 4);
            total += medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('L', 4,5);
            total += large.calcCost();
        }
        System.out.println("total = " + total);


       /* pizza2.size = 'M';
        pizza2.numberOfCheeseTopping = 2;
        */

    }

}
