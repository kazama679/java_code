package ss21.b9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B9 {
    public static final List<BankAccount> accounts = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        accounts.add(new BankAccount("AC001", 5000));
        accounts.add(new BankAccount("AC002", 1000));

        accounts.getFirst().Deposit(scanner);
        System.out.println("Số tiền sau khi nạp của tk AC001: "+accounts.getFirst().getBalance());
        accounts.getFirst().Withdraw(scanner);
        System.out.println("Số tiền sau khi rút của tk AC001: "+accounts.getFirst().getBalance());

        System.out.println("Số tiền trc khi nhận của tk AC002: "+accounts.get(1).getBalance());
        accounts.getFirst().Transfer(scanner);
        System.out.println("Số tiền sau khi chuyển của tk AC001: "+accounts.getFirst().getBalance());
        System.out.println("Số tiền sau khi nhận của tk AC002: "+accounts.get(1).getBalance());
    }
}