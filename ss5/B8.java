package ss5;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Mảng không hợp lệ");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean hasUnique = false;
        System.out.println("Mảng sau khi loại bỏ phần tử trùng lặp:");
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
                hasUnique = true;
            }
        }
        if (!hasUnique) {
            System.out.println("Không có phần tử nào duy nhất trong mảng");
        }
    }
}