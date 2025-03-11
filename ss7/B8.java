package ss7;

import java.util.Random;
import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        String c = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder s = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int index = rand.nextInt(c.length());
            s.append(c.charAt(index));
        }
        System.out.println("Chuỗi ngẫu nhiên: " + s);
    }
}