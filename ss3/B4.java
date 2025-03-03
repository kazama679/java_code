package ss3;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so tu 1 - 7: ");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Chủ nhật");
                break;
            case 2:
                System.out.println("Thứ Hai");
                break;
            case 3:
                System.out.println("Thứ Ba");
                break;
            case 4:
                System.out.println("Thứ Tư");
                break;
            case 5:
                System.out.println("Thứ Năm");
                break;
            case 6:
                System.out.println("Thứ Sáu");
                break;
            case 7:
                System.out.println("Thứ Bảy");
                break;
            default:
                System.out.println("Số nhập vào không hợp lệ");
        }
    }
}
