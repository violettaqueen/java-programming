package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String > map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("B04", "Violetta");
        map.put("B06", "Jon");
        map.put("B09", "Nathan");

        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.get("B06"));

        // change the value:
        map.put("C02", "Elizabeth");

        System.out.println(map);

        map.replace("B06", "Olga");
        System.out.println(map);

        map.remove("B09");
        System.out.println(map);






    }
}
