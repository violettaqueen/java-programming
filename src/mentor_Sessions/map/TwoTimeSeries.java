package mentor_Sessions.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoTimeSeries {

    public static void main(String[] args) {

        Map<Integer, Double> seriesA = new LinkedHashMap<>();
        seriesA.put(1, 1.0);
        seriesA.put(2, 1.5);
        seriesA.put(3, 2.0);

        Map<Integer, Double> seriesB = new LinkedHashMap<>();
        seriesB.put(2, 1.0);
        seriesB.put(3, 2.5);
        seriesB.put(5, 1.0);

        Map<Integer, Double> summation = new LinkedHashMap<>();

    }

    public static Map<Integer, Double> combineTwoSeries(Map<Integer, Double> map1, Map<Integer, Double> map2) {

        map2.forEach((key, value) -> map1.put(key, map1.getOrDefault(key, 0.0) + value));
        return map1;
    }
    public static Map<Integer, Double> combineTwoSeries2(Map<Integer, Double> map1, Map<Integer, Double> map2){

        Map<Integer, Double> summation = new LinkedHashMap<>();
        summation.putAll(map1);
        for (Integer eachKey : map2.keySet()) {
            if(!(summation.containsKey(eachKey))){
                summation.put(eachKey, map2.get(eachKey));
            }else{
                summation.put(eachKey, map2.get(eachKey) + summation.get(eachKey));
            }
        }
        System.out.println(summation);
        return summation;

    }
}







