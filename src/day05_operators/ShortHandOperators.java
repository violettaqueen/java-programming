package day05_operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        int a = 20;
        System.out.println(a);  // 20
        System.out.println(a);  // 20

        a = 40;
        System.out.println(a);

        a = 90;
        System.out.println(a);

        System.out.println("--------------------------------");

        // addition assignment used to increase the value

        double balance = 100;
        balance += 1000; // balance = 100 + 1000

        System.out.println("balance = " + balance);

        balance += 500; // balance = 1100 + 500

        System.out.println("balance = " + balance);

        balance += 10000;
        System.out.println("balance = " + balance);

        // subtraction assignment operator

        balance -= 1000; // balance = 11600 - 1000
        System.out.println("balance = " + balance);

        balance -= 5000;
        System.out.println("balance = " + balance);

        System.out.println("----------------------------");

        double salary = 45000;

        salary *= 2; // salary = 45000 * 2
        System.out.println(salary);

        salary *= 3;
        System.out.println(salary);

        System.out.println("--------------------------");

        double doge = 0.00000123;

                doge *= 1000;
        System.out.println(doge);
        
        // division assignment
        
        double eth = 4;
        System.out.println("eth = " + eth);

        eth /= 2;
        System.out.println("eth = " + eth);

        System.out.println("-----------------------------");

        // remainder operator

        // x % = y


        int b = 39;
        b %= 7; // b = 39 % 7
        System.out.println(b);






        

    }

}
