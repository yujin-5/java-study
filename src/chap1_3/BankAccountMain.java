package chap1_3;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        myAccount.deposit(4000);

        //계좌 이체
        myAccount.transfer(yourAccount,3000);
        myAccount.displayBalance();
        yourAccount.displayBalance();

    }
}
