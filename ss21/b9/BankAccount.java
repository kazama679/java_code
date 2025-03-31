package ss21.b9;

import java.util.Scanner;

public class BankAccount {
    private String accountId;
    private double balance;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
    }

    public BankAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public void Deposit(Scanner scanner){
        while(true){
            try {
                System.out.println("Nhập vào số tiền nạp: ");
                double amount = Double.parseDouble(scanner.nextLine());
                Invalidator.validDeposit(amount);
                this.balance += amount;
                break;
            }catch(NumberFormatException e1){
                System.out.println("K p số");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public void Withdraw(Scanner scanner){
        while(true){
            try {
                System.out.println("Nhập vào số tiền rút: ");
                double amount = Double.parseDouble(scanner.nextLine());
                Invalidator.validWithdraw(amount, this.balance);
                this.balance -= amount;
                break;
            }catch (NumberFormatException e1){
                System.out.println("K p số");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public void Transfer(Scanner scanner){
        while(true){
            try {
                System.out.println("Nhập vào id tk nhận tiền: ");
                String id = scanner.nextLine();
                int idIndex= Invalidator.validWithdraw2(id);
                System.out.println("nhập vào số tiền chuyển: ");
                double amount = Double.parseDouble(scanner.nextLine());
                Invalidator.validWithdraw(amount, this.balance);
                this.balance -= amount;
                B9.accounts.get(idIndex).setBalance(B9.accounts.get(idIndex).getBalance() + amount);
                break;
            }catch (NumberFormatException e1){
                System.out.println("k p số");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
