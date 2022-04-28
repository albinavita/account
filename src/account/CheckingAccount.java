package account;

public class CheckingAccount extends  Account{

    public CheckingAccount(int balance){
        super(balance);
    }

    public int getDebt(){
        return (balance < 0) ? -balance : 0;
    }
    @Override
    public void withdraw(int n){
        balance -= n;
    }
}
