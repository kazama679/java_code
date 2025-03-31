package ss21.b7;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tk = 1000000;
        while (true) {
            try {
                System.out.println("Nhập vào số tiền rút: ");
                double n = Double.parseDouble(sc.nextLine());
                if (n > tk) {
                    throw new Check("Lỗi: Số tiền rút vượt quá số dư!");
                }
                if (tk - n < 50000) {
                    throw new Check("Lỗi: Tài khoản phải duy trì số dư tối thiểu 50.000 đồng!");
                }
                tk = tk - n;
                System.out.println("Số tiền còn lại sau khi rút: " + tk);
                break;
            } catch (NumberFormatException e1) {
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
