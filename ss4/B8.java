package ss4;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Nhập số nguyên dương N: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                }
            } else {
                sc.next();
            }
            System.out.println("Vui lòng nhập lại!");
        }
        System.out.println("Các số Armstrong từ 1 đến " + n + ":");
        for (int i = 1; i <= n; i++) {
            int temp = i, sum = 0, digits = 0;
            int x = temp;
            while (x > 0) {
                digits++;
                x /= 10;
            }
            x = temp;
            while (x > 0) {
                int digit = x % 10;
                sum += Math.pow(digit, digits);
                x /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}