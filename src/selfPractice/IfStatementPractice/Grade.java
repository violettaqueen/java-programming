package selfPractice.IfStatementPractice;

public class Grade {

    public static void main(String[] args) {

        char grade = 'B';
        String result = "";

        if( grade == 'A'){
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        }else{
            result = "Failed";
        }


        System.out.println(result);


    }
}
/*
 Create a class named Grade, a char variable named grade is given. write a program to print the following
  messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement
 */