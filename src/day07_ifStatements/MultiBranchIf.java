package day07_ifStatements;

public class MultiBranchIf {

    public static void main(String[] args) {

        int number = 100;

        String result = "";

        if(number > 0){ //true
            result = "Positive";
        }
        if(number < 0){
            result = "Negative";
        }
        if(number == 0){
           result = "Zero";
        }
        System.out.println(result);

        System.out.println("--------------------------------------------------");

        String result2 = "";

        if(number > 0){
            result2 = "Positive";

        }else if(number < 0){
            result2 = "Negative";

        }else{
            result2 = "Zero";
        }
        System.out.println(result2);


    }

}
/*
Multi branch If:
if(Condition1){
StatementA
}else if(Condition2){
StatementB
}else if(Condition3){
StatementC
}else{
StatementD
}
 */