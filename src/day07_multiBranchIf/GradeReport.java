package day07_multiBranchIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 85;  // assume 0-100
        String result = "Your grade is ";

        if (score >= 90) {    // if score < 90 - false
            result += "A";
        } else if (score >= 80 && score < 90) { // score < 80 - false
            result += "B";
        } else if (score >= 70 && score < 80) { // score < 70 - false
            result += "C";
        } else if (score >= 60 && score < 70) { // score < 60 - false
            result += "D";
        } else {
            result = "F";
        }
        System.out.println(result);
    }

}
