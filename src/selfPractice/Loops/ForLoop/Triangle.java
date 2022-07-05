package selfPractice.Loops.ForLoop;

public class Triangle {

    public static void main(String[] args) {



        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        double distance;
        String result = "";
        double radius = 5;
        for (int i = 0; i <= 2 * radius; i++) {
            for (int j = 0; j <= 2 * radius; j++) {
                distance = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
                if(distance > radius - 0.5 && distance < radius + 0.5){
                    result += "*";
                } else {
                    result += " ";
                }
            }
            result += "\n";
        }
        System.out.println(result);
    }


    }





