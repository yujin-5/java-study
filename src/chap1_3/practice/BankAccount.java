package chap1_3.practice;

public class BankAccount {

    String accountNumber;
    String owner;
    double balance;

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if(balance<amount){
            System.out.println("잔액 부족");
            return;
        }
            balance -= amount;

    }

    void displayBalance(){
        System.out.println(balance);
    }

    //계좌 이체
    void transfer(BankAccount takenAccount, double amount){
        //하나 은행에서 받은 돈을 우리은행 계좌에 추가
        balance += amount;
        //하나 은행 계좌에서는 잔액을 감소
        takenAccount.balance -= amount;
    }

    public static void main(String[] args) {
        BankAccount hanaBank = new BankAccount();
        BankAccount wooriBank = new BankAccount();

        hanaBank.deposit(3000);
        hanaBank.withdraw(1000);
        hanaBank.displayBalance();

        //계좌 이체
        wooriBank.transfer(hanaBank, 1000);

        System.out.println("===하나은행 잔액===");
        hanaBank.displayBalance();
        System.out.println("===우리은행 잔액===");
        wooriBank.displayBalance();



    }

}
