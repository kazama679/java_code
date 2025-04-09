import presentation.AccountUI;
import presentation.FundsTransferUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. ACCOUNT MENU");
            System.out.println("2. FundsTransferUI");
            System.out.println("3. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice) {
                case 1:
                    AccountUI.displayAccountMenu(scanner);
                    break;
                case 2:
                    FundsTransferUI.displayFundsTransferMenu(scanner);
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}