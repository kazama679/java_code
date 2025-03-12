package ss9.b8;

public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0){
            this.balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount>this.balance){
            System.out.println("Số dư k đủ");
        }else{
            this.balance -= amount;
        }
    }
    public void transfer(BankAccount recipient, double amount){
        if(amount>this.balance){
            System.out.println("Số dư k đủ");
            return;
        }
        withdraw(amount);
        recipient.deposit(amount);
    }
    public void display(){
        System.out.println("Số tk: "+this.accountNumber);
        System.out.println("Tên tk: "+this.accountHolder);
        System.out.println("Số dư: "+this.balance);
    }
}
