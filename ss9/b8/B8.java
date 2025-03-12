package ss9.b8;

public class B8 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("9999", "Nguyễn Văn A", 10000);
        BankAccount account2 = new BankAccount("8888", "Nguyễn Xuân B", 10000);
        System.out.println("Số dư ban đầu: ");
        account1.display();
        account1.deposit(9999);
        System.out.println("\nSố dư sau khi nạp tiền: ");
        account1.display();

        account1.withdraw(9999);
        System.out.println("\nSố dư sau khi rút tiền: ");
        account1.display();

        System.out.println("\nSố dư ban đầu của người 1: ");
        account1.display();
        System.out.println("\nSố dư ban đầu của người 2: ");
        account2.display();
        account1.transfer(account2, 9999);
        System.out.println("\nSố dư sau khi chuyển tiền của người 1: ");
        account1.display();
        System.out.println("\nSố dư sau khi chuyển tiền của người 2: ");
        account2.display();
    }
}
