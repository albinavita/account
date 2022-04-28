package account;

public class Account {
    protected int balance;

    public Account(int balance){
        this.balance = balance;
    }

    public void withdraw(int n){
        if(n > balance){
            balance = 0;
        }else {
            balance -= n;
        }
    }
    public void put(int n){
        balance += n;
    }
    public int checkBalance(){
        return balance;
    }
}
