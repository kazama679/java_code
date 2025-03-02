package ss2;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thoi gian ban dau: ");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();

        System.out.print("Nhap thoi gian them: ");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        int time = (h * 3600 + m * 60 + s) + (h2 * 3600 + m2 * 60 + s2);
        int hChange = time / 3660;
        int mChange = (time % 3600) / 60;
        int sChange = time % 60;

        System.out.printf("Tổng thời gian: %d giờ %d phút %d giây", hChange, mChange, sChange);
    }
}
