package ss4;

import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("MENU:");
            System.out.println("1. Kiểm tra số nguyên tố");
            System.out.println("2. Kiểm tra số hoàn hảo");
            System.out.println("3. Tìm và tính tổng các ước của một số");
            System.out.println("4. Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập số: ");
                    int n = sc.nextInt();
                    boolean isPrime = true;
                    if (n < 2) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i * i <= n; i++) {
                            if (n % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        System.out.println(n + " là số nguyên tố.");
                    } else {
                        System.out.println(n + " không phải là số nguyên tố.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập số: ");
                    int m = sc.nextInt();
                    int sum1 = 0;
                    for (int i = 1; i < m; i++) {
                        if (m % i == 0) {
                            sum1 += i;
                        }
                    }
                    if (sum1 == m) {
                        System.out.println(m + " là số hoàn hảo.");
                    } else {
                        System.out.println(m + " không phải là số hoàn hảo.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập số: ");
                    int p = sc.nextInt();
                    int sum2 = 0;
                    System.out.print("Các ước là: ");
                    for (int i = 1; i <= p; i++) {
                        if (p % i == 0) {
                            System.out.print(i + " ");
                            sum2 += i;
                        }
                    }
                    System.out.println("\nTổng là: " + sum2);
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lỗi");
            }
        } while (choice != 4);
    }
}