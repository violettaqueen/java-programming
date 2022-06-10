package day22_arrayList;

public class MaximumMinimumNumbersOfMultiDimArray {

    public static void main(String[] args) {
        
       //index:                 0               1                2
        int[][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} }; // length 3
      // index of elements: 0    1   2      0    1    2     0     1   2  
        
        int max = array[0][0];
        int min = array[0][0];

        for (int[] each1D : array) {

            for (int eachElement : each1D) {
                
                if(eachElement > max){
                    max = eachElement;
                }
                if(eachElement < min){
                    min = eachElement;
                }
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
    
}
