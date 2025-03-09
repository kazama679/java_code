package ss6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mk: ");
        String password = sc.nextLine();
        if(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%]).{8,}$",password)){
            System.out.println("mật khẩu hợp lệ");
        }else{
            System.out.println("mật khẩu k hợp lệ");
        }
    }
}
