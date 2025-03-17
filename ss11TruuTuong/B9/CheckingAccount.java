package ss11TruuTuong.B9;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(double amount){
        balance -= amount;
    }
    @Override
    public void deposit(double amount){
        if(amount<0){
            System.out.println("số tiền nạp k đc âm");
            return;
        }
        balance += amount;
    }
    @Override
    public void displayBalance(){
        System.out.printf("tài khoản vãng lai %s: %f\n", accountNumber, balance);
    }
}