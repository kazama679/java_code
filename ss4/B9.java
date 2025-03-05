package ss4;

import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        }
        System.out.println("Các số Palindrome từ 1 đến " + n + ":");
        for (int i = 1; i <= n; i++) {
            int original = i, reversed = 0, temp = i;
            while (temp > 0) {
                reversed = reversed * 10 + temp % 10;
                temp /= 10;
            }
            if (original == reversed) {
                System.out.print(i + " ");
            }
        }
    }
}
