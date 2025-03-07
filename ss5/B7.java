package ss5;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Mảng không có phần tử");
            return;
        }
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhâp phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int countEven = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            }
        }
        int evenIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr2[evenIndex] = arr[i];
                evenIndex++;
            } else {
                arr2[countEven] = arr[i];
                countEven++;
            }
        }
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}