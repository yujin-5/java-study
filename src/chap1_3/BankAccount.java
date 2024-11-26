package chap1_3;

public class BankAccount {

    String accountNumber;
    //0으로 시작할 수도 있으므로 int가 아닌 string임
    String owner;
    double balance;
    //int는 23억까지만 저장할 수 있음

    void deposit(double amount){
        balance+= amount;
        System.out.println("amount = " + amount);
    }

    void withdraw(double amount){
        if(balance<amount){
            System.out.println("잔액 부족");
            return;
        }
        balance-=amount;
        System.out.println("amount = " + amount);
    }

    void displayBalance(){
        System.out.println("balance = " + balance);
    }

    //계좌이체
    void transfer(BankAccount takenAccount, int money){
        //상대방 계좌에서 받은 돈을 내 잔액에 추가
        //상대 계좌를 받아야 함
        //내 계좌의 잔액에 받은 돈을 추가
        balance -= money;
        //상대방 계좌에서 받은 돈을 감소
        takenAccount.balance += money;

    }
}
