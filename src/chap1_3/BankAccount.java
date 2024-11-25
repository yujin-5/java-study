package chap1_3;

public class BankAccount {

    int accountNumber;
    String owner;
    double balance;

    void deposit(double amount){
        balance+= amount;
        System.out.println("amount = " + amount);
    }

    void withdraw(double amount){
        if(balance<amount){
            System.out.println("잔액 부족");
        }
        balance-=amount;
        System.out.println("amount = " + amount);
    }

    void displayBalance(){
        System.out.println("balance = " + balance);
    }
}
