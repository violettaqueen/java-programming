package mentor_Sessions.HousePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestHouseObjects {

    public static void main(String[] args) {

        ArrayList<House> houses = new ArrayList<>(Arrays.asList(
                new SquareHouse("Square House - 1", 20),
                new SquareHouse("Square House - 2", 25),
                new SquareHouse("Square House - 3", 30),

                new RectangleHouse("Rectangle House - 1", 30, 20),
                new RectangleHouse("Rectangle House - 2", 20, 25),

                new CircleHouse("Circle House - 1", 15),
                new CircleHouse("Circle House - 2", 20),
                new CircleHouse("Circle House - 3", 10)));

        List<House> housesForCustomer = new ArrayList<>();
        for (House each : houses) {
            if (each.areaOfHouse()>600){
                housesForCustomer.add(each);
            }
        }
        System.out.println(housesForCustomer);

    }


}
