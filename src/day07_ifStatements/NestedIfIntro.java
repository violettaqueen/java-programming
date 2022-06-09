package day07_ifStatements;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 95;

        if (score >= 0 && score <= 100) {

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");
        }

    }
}

