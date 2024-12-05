package chap1_10.practice.q2;

public abstract class BankAccount {

    //필드
    protected String accountNumber;
    protected double balance;

    //생성자
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //추상 메서드
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

}
