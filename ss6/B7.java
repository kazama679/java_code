package ss6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập email: ");
        String email = sc.nextLine().trim();
        if(Pattern.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,6})+$", email)){
            String[] str = email.split("@");
            System.out.println("Tên người dùng: " + str[0]);
            System.out.println("Tên miền: " + str[1]);
        } else {
            System.out.println("Email không hợp lệ.");
        }
    }
}
