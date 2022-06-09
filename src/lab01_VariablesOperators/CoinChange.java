package lab01_VariablesOperators;

public class CoinChange {

    public static void main(String[] args) {

        int priceInCents = 60;
        int change = 100 - priceInCents; //change 35 --> 1 quarter + 1 dime: 25+10=35

        int quarter = (change) / 25;
        int dimes = ((change)%25) / 10;
        int nickles = ((change%25)%10) / 5;


        System.out.println("quarter " + quarter + " dimes " + dimes + " nickles " + nickles);

    }

}
