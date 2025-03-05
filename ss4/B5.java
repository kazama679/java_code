package ss4;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n la so nguyen duong: ");
        int n = sc.nextInt();
        int count = 0;
        int sum;
        int check=0;
        if (n < 0) {
            System.out.println("so nhap vao k hop le");
            return;
        } else {
            System.out.print("Các số hoàn hảo nhỏ hơn " + n + " là: ");
            for (int i = 1; i < n - 1; i++) {
                sum = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum += j;
                    }
                }
                if (sum == i) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("k có");
            }
        }
    }
}