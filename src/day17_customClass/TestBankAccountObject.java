package day17_customClass;

public class TestBankAccountObject {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();

        bankAccount1.setInfo("Violetta", 1234567894);
        System.out.println(bankAccount1);
        // we need to set a balance, use deposit
        bankAccount1.deposit(1000);
        bankAccount1.checkBalance();

        bankAccount1.withdraw(700);
        bankAccount1.checkBalance();

        bankAccount1.deposit(-1000);
        bankAccount1.checkBalance();

        bankAccount1.withdraw(5000);
        bankAccount1.checkBalance();

        System.out.println("----------------------------------------------------------------");

        BankAccount bankAccount2 = new BankAccount();

        BankAccount bankAccount3 = new BankAccount();

        bankAccount2.setInfo("Nathan", 5464748490L);


    }

}
