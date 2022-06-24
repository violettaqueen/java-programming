package selfPractice.Encapsulation;

public class TestItems {

    public static void main(String[] args) {

        Item item1 = new Item("1toilet paper",50,3);

        item1.getName();
        item1.getQuantity();
        item1.getUnitPrice();
        item1.calCost();

        System.out.println(item1);



    }
}

