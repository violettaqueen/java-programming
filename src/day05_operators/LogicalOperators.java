package day05_operators;

public class LogicalOperators {

    public static void main(String[] args) {

        double salary = 45000;
        int creditScore = 700;
        int age = 42;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;
        System.out.println(eligibleForLoan);

        System.out.println("--------------------------------------");

        age = 32;
        String country = "USA";
        boolean eligibleToVote = age >= 18 && country == "USA";
        System.out.println(eligibleToVote);

        System.out.println("-------------------------------");

        country = "Japan";
        boolean nativeEnglishSpeaker = country == "Canada" || country == "USA" || country == "Australia";
        System.out.println(nativeEnglishSpeaker);

        System.out.println("-----------------------------------------------");

        String answer = "yes";
        boolean validAnswer = answer == "yes" || answer == "no";
        System.out.println(validAnswer);

        System.out.println("----------------------------------------------");

        char grade = 'A';
        boolean passedExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        System.out.println(passedExam);

        System.out.println("------------------------------------------");

        System.out.println(!true);

        String a = "yes";
        boolean yes = a == "yes"; // true
        boolean no = !yes;        // false
        System.out.println(yes);
        System.out.println(no);

        System.out.println("---------------------------------------");

        int score = 65;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println(passed);
        System.out.println(failed);

        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");

        System.out.println(true == !false && false == !true && true != !true);
        //                   true         &&       true      &&     true
        //

    }
}

