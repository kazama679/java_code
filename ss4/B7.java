package ss4;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();
        if(n<1){
            System.out.println("Nhap sai");
        }
        System.out.println("Các số Happy từ 1 đến " + n + ":");
        for (int i = 1; i <= n; i++) {
            int a = i;
            int b = i;
            do {
                int sum1 = 0, temp1 = a;
                while (temp1 > 0) {
                    int digit = temp1 % 10;
                    sum1 += digit * digit;
                    temp1 /= 10;
                }
                a = sum1;
                int sum2 = 0, temp2 = b;
                while (temp2 > 0) {
                    int digit = temp2 % 10;
                    sum2 += digit * digit;
                    temp2 /= 10;
                }
                b = sum2;
                sum2 = 0;
                temp2 = b;
                while (temp2 > 0) {
                    int digit = temp2 % 10;
                    sum2 += digit * digit;
                    temp2 /= 10;
                }
                b = sum2;
            } while (b != 1 && a != b);
            if (b == 1) {
                System.out.print(i + " ");
            }
        }
    }
}