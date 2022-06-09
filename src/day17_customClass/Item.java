package day17_customClass;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public void setInfo(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public double calcCost(){
        double itemTotalPrice = unitPrice * quantity;
        return itemTotalPrice;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", itemTotalPrice=" +
                '}';
    }
}
