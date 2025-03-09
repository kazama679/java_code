package ss6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập email: ");
        String email = sc.nextLine();
        if(Pattern.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,6})+$",email)){
            System.out.println("Email hợp lệ");
        }else{
            System.out.println("Email k hợp lệ");
        }
    }
}
