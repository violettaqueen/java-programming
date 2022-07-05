package replit.StringPractice.Loops;

import java.util.Locale;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of item 1");
        String item = input.next();

        System.out.println("Enter the price of the " + item);
        double price = input.nextDouble();

        System.out.println("How many " + item + " will you buy?");
        int quantity = input.nextInt();

        double totalPriceOfThisItem = price * quantity;
        String shoppingList = item + " x " + quantity + " - $" + quantity * price;


        System.out.println("Do you want to add more items to the shopping list?");
        String yesNo = input.next();

        int numberOfItems = 1;


        while (yesNo.equals("yes")) {
            numberOfItems++;

            System.out.println("Enter the name of item " + numberOfItems);
            item = input.next();

            System.out.println("Enter the price of the " + item);
            price = input.nextDouble();

            System.out.println("How many " + item + " will you buy?");
            quantity = input.nextInt();

            totalPriceOfThisItem += price * quantity;
            shoppingList += "\n" + item + " x " + quantity + " - $" + quantity * price;

            System.out.println("Do you want to add more items to the shopping list?");
            yesNo = input.next();

            if (yesNo.equals("no")) {

            }
        }
        System.out.println("SHOPPING LIST:\n" + shoppingList + "\nTotal cost: $" + totalPriceOfThisItem);
    }
}

