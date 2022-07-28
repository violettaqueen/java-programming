package replit.loops;

public class UtopianTree {

    public static void main(String[] args) {

        int year = 0;
        int growth = 0;
        int treeSize = 0;



        for (int i = 1; i <= 10; i++) {
            year = i;

            if (year >= 1 && year <= 3) {
                growth = 1;
                treeSize++;
                System.out.println("year " + year + " - growth " + growth + " cm\ntree size: " + treeSize + " cm");

            } else {
                growth = 2;
                treeSize += 2;
                System.out.println("year " + year + " - growth " + growth + " cm\ntree size: " + treeSize + " cm");

            }

        }

    }
}

/*
Use a loop to track the growth of the Utopian Tree. The tree grows exactly 1 cm for the first three years, and then
 afterwards it grows by 2 cm every year. Show the growth of the tree each year up to year 10. See the example flow below.
Use the format:
year x - growth x cm
tree size: x cm

where the 'x' values are different values of year, the growth amount, and the total tree size up to that year
Main topics: loops, primitive datatypes, operators, concatenation, if statements

Example Flow:

year 1 - growth 1 cm
tree size: 1 cm

year 2 - growth 1 cm
tree size: 2 cm
year 3  - growth 1 cm
tree size: 3 cm

year 4 - growth 2 cm
tree size: 5 cm

year 5 - growth 2 cm
tree size: 7 cm

year 6 - growth 2 cm
tree size: 9 cm

... until you reach year 10
 */
