package day25_Constructor;

import day26_Statics.Car;

public class TestCarpetObject {

    public static void main(String[] args) {

        Carpet persianCarpet = new Carpet(24, 12, 25, true);

        System.out.println(persianCarpet);

        Carpet simpleCarpet = new Carpet(34, 12, 19, false);

        System.out.println(simpleCarpet);


    }
}
