package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();  // random order, one key can be null, multiple values can be null
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Aaron", 78000);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);
        hashMap.put(null, 120000);

        System.out.println(hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();  // insertion order, one key can be null, multiple values can be null
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Aaron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 120000);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("-------------------------------------------------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>();  // sorted order, key CAN NOT be null, value can be null

        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Aaron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null);
        //treeMap.put(null, 120000);  key CAN NOT be null in treeMap

        System.out.println("treeMap = " + treeMap);

        System.out.println("-----------------------------------------------------------------------------------------");

        Map<String, Integer> hashTable = new Hashtable<>();  // random order, both key and value doesn't accept null, Synchronized

        hashTable.put("Daniel", 95000);
        hashTable.put("Emily", 100000);
        hashTable.put("Bella", 85000);
        hashTable.put("Aaron", 78000);
        // hashTable.put("Chris", null);  values CAN NOT be null
        // hashTable.put("Breanna", null);
        // hashTable.put(null, 120000);   key CAN NOT be null

        System.out.println("hashTable = " + hashTable);


    }
}
