package ss11TruuTuong.B9;

public class Bank {
    private BankAccount[] accounts;
    private int count;

    public Bank() {
        accounts = new BankAccount[10];
        count = 0;
    }

    public void addAccount(BankAccount account) {
        if (count < accounts.length) {
            accounts[count] = account;
            count++;
            System.out.println("Đã thêm tk");
        } else {
            System.out.println("Ngân hàng đã đầy, không thêm tk đc.");
        }
    }

    public void displayAllBalances() {
        System.out.println("\n--- Số dư tài khoản ---");
        for (int i = 0; i < count; i++) {
            accounts[i].displayBalance();
        }
    }
}