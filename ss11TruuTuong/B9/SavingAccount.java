package ss11TruuTuong.B9;

public class SavingAccount extends BankAccount{
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("tài khoản tiết kiệm sẽ không cho phép rút vượt quá số dư");
            return;
        }
        balance = balance - amount;
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
        System.out.printf("tài khoảng tiết kiệm %s: %f\n", accountNumber, balance);
    }
}
