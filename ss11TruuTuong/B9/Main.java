package ss11TruuTuong.B9;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        BankAccount savingAcc = new SavingAccount("BANK1", 1000);
        BankAccount checkingAcc = new CheckingAccount("BANK2", 500);

        bank.addAccount(savingAcc);
        bank.addAccount(checkingAcc);

        savingAcc.deposit(100);
        savingAcc.withdraw(200);
        checkingAcc.withdraw(300);
        checkingAcc.deposit(400);

        bank.displayAllBalances();
    }
}
