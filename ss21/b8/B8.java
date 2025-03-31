package ss21.b8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Nhập vào số điện thoại(cách nhau bởi dấu phẩy): ");
                String phone = sc.nextLine().trim();
                String[] split = phone.split(",");
                List<String> list = new ArrayList<>();
                for (int i = 0; i < split.length; i++) {
                    try {
                        InvalidPhoneNumberLengthException.validatePhoneNumber(split[i]);
                        list.add(split[i]);
                    }catch (InvalidPhoneNumberLengthException e){
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println(list);
                break;
            }catch (NumberFormatException e) {
                System.out.println("Số điện thoại chứa ký tự k hợp lệ");
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
