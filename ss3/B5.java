package ss3;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dau tien: ");
        int a = sc.nextInt();
        System.out.println("Nhap ki tu +-*/ de thuc hien phep tinh: ");
        char b = sc.next().charAt(0);
        System.out.println("Nhap so thu 2: ");
        int c = sc.nextInt();
        if(b=='+'){
            System.out.println("ket qua: "+(a+c));
        } else if (b=='-') {
            System.out.println("ket qua: "+(a-c));
        } else if (b=='*') {
            System.out.println("ket qua: "+(a*c));
        } else if (b=='/') {
            if(c==0){
                System.out.println("Không thể chia cho 0");
                return;
            }
            System.out.println("ket qua: "+(a/c));
        }else{
            System.out.println("Phép toán không hợp lệ");
        }
    }
}
