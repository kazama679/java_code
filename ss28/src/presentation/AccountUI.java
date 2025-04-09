package presentation;

import business.model.Account;
import business.model.AccountStatus;
import business.service.account.AccountService;
import business.service.account.AccountServiceImp;

import java.util.List;
import java.util.Scanner;

public class AccountUI {

    public static void displayAccountMenu(Scanner scanner) {
        AccountService accountService = new AccountServiceImp();
        int choice;
        do {
            System.out.println("***************ACCOUNT MENU**************");
            System.out.println("1. Danh sách tài khoản");
            System.out.println("2. Tạo tài khoản");
            System.out.println("3. Cập nhật tài khoản"); //Tên + trạng thái
            System.out.println("4. Xóa tài khoản");//Cập nhật trạng thái là inactive
            System.out.println("5. Chuyển khoản");
            System.out.println("6. Tra cứu số dư tài khoản");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayList(accountService);
                    break;
                case 2:
                    add(scanner, accountService);
                    break;
                case 3:
                    edit(scanner, accountService);
                    break;
                case 4:
                    delete(scanner, accountService);
                    break;
                case 5:
                    fundsTransfer(scanner, accountService);
                    break;
                case 6:
                    search(scanner, accountService);
                    break;
                case 7:
                    System.out.println("Thoát");
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-7");
            }
        } while (choice!=7);
    }

    public static void displayList(AccountService accountService) {
        List<Account> accountList = accountService.findAllAccounts();
        if (accountList.isEmpty()) {
            System.out.println("Không có tài khoản nào.");
        } else {
            System.out.println("Danh sách tài khoản:");
            for (Account acc : accountList) {
                System.out.println(acc);
            }
        }
    }

    public static void add(Scanner scanner, AccountService accountService) {
        System.out.println("Nhập tên tài khoản:");
        String name = scanner.nextLine();
        System.out.println("Nhập số dư ban đầu:");
        double balance = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập trạng thái (ACTIVE, INACTIVE, BLOCKED):");
        AccountStatus status = AccountStatus.valueOf(scanner.nextLine().toUpperCase());
        Account newAcc = new Account(0, name, balance, status);
        if (accountService.createAccount(newAcc)) {
            System.out.println("Tạo tài khoản thành công!");
        } else {
            System.out.println("Tạo tài khoản thất bại.");
        }
    }

    public static void edit(Scanner scanner, AccountService accountService) {
        System.out.println("Nhập ID tài khoản cần cập nhật:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên mới:");
        String newName = scanner.nextLine();
        System.out.println("Nhập trạng thái mới (ACTIVE, INACTIVE, BLOCKED):");
        AccountStatus newStatus = AccountStatus.valueOf(scanner.nextLine().toUpperCase());
        Account updateAcc = new Account(id, newName, 0, newStatus);
        if (accountService.updateAccount(updateAcc)) {
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Cập nhật thất bại.");
        }
    }

    public static void delete(Scanner scanner, AccountService accountService) {
        System.out.println("Nhập ID cần xóa:");
        int delId = Integer.parseInt(scanner.nextLine());
        System.out.println(accountService.deleteAccount(delId) ? "Đã chuyển sang trạng thái INACTIVE." : "Xóa thất bại.");
    }

    public static void search(Scanner scanner, AccountService accountService) {
        System.out.println("Nhập ID tài khoản:");
        int balId = Integer.parseInt(scanner.nextLine());
        double bal = accountService.checkBalance(balId);
        System.out.println(bal >= 0 ? "Số dư: " + bal : "Không tìm thấy tài khoản.");
    }

    public static void fundsTransfer(Scanner scanner, AccountService accountService) {
        System.out.println("Nhập số tài khoản người gửi:");
        int accSenderId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên tài khoản người gửi:");
        String accSenderName = scanner.nextLine();
        System.out.println("Nhập số tài khoản người nhận:");
        int accReceiverId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên tài khoản người nhận:");
        String accReceiverName = scanner.nextLine();
        System.out.println("Nhập số tiền chuyển:");
        double amount = Double.parseDouble(scanner.nextLine());
        int result = accountService.fundsTransfer(accSenderId, accSenderName, accReceiverId, accReceiverName, amount);
        switch (result) {
            case 1:
                System.err.println("Thông tin tài khoản người gửi không chính xác");
                break;
            case 2:
                System.err.println("Thông tin tài khoản người nhận không chính xác");
                break;
            case 3:
                System.err.println("Số dư tài khoản không đủ để chuyển khoản");
                break;
            case 4:
                System.out.println("Chuyển khoản thành công!!!");
                break;
        }
    }
}