package chap1_10.practice.q2;

public class SavingAccount extends BankAccount{

    private double interestRate = 3.0;

    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance+= amount;
    }
    @Override
    public void withdraw(double amount) {
        balance-=amount;
    }

    public void applyInterest(){
        balance*=interestRate;

}}
