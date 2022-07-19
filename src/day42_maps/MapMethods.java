package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {


        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        Map<String, String> employees = new LinkedHashMap<>();

        employees.putAll(map); // object will not be added, but pairs only be added,
        // that is how you add treemap to linkedHashMap

        System.out.println(employees);

        System.out.println(map.equals(employees));  // compare the VALUE, not the object -> map == employees



    }
}
