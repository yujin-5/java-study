package chap1_10.practice.q2;

public class CheckingAccount extends BankAccount{

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(double amount) {
        if(balance>=amount){
        balance-=amount;
        } else{
            return;
        }
    }
}
