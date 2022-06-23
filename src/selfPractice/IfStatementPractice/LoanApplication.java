package selfPractice.IfStatementPractice;

public class LoanApplication {

    public static void main(String[] args) {

        double salary = 34000;
        int creditScore = 720;

        String result = "";

        if (salary >= 45000 && creditScore >= 700){
            result = "Is Eligible";
        }else{


            result = "Not Eligible";
        }
        System.out.println(result);
    }
}
/*
 Create a class named LoanApplication. two variables named salary and createdScore are declared and given,
  write a program that can check if the person is eligible to apply for a loan
            Note:In order to be eligible for a loan:
                    1. salary: at least 45K
                    2. credit score: at least 700
 */