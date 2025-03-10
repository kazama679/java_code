package ss8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email, password;
        while (true) {
            System.out.println("Nhập email: ");
            email = sc.nextLine();
            if (Pattern.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,6})+$", email)) {
                break;
            }
            System.out.println("Email không hợp lệ, vui lòng nhập lại!");
        }
        while (true) {
            System.out.println("Nhập mật khẩu: ");
            password = sc.nextLine();
            if (Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!&*]).{8,}$", password)) {
                break;
            }
            System.out.println("Mật khẩu không hợp lệ, vui lòng nhập lại!");
        }
        System.out.println("Email và mật khẩu hợp lệ!");
    }
}
