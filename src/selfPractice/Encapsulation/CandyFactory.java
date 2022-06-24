package selfPractice.Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {


        ArrayList<Candy> candies = new ArrayList<>();

        Candy candy1 = new Candy("Roshen",2,12,false);
        Candy candy2 = new Candy("Alenushka", 1,5, true);
        Candy candy3 = new Candy("Ukrainka", 10,6, false);
        Candy candy4 = new Candy("Rocher", 4, 11, true);
        Candy candy5 = new Candy("Chirardelli", 8,4,true);

        candies.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));

        for (Candy eachBrand : candies) {
            System.out.println(eachBrand.getBrand() + " " + eachBrand.getPrice());
        }





    }
}