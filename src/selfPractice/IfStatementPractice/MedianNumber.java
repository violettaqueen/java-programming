package selfPractice.IfStatementPractice;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 6, b = 45, c = 20;

        boolean aIsMedian = a > b && a < c || a > c && a < b;
        boolean bIsMedian = b > a && b < c || b > c && b < a;
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian){
            System.out.println(a + " is median number");
        }
        if (bIsMedian){
            System.out.println(b + " is median number");
        }
        if (cIsMedian){
            System.out.println(c + " is median number");
        }
    }
}
