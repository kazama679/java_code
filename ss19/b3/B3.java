package ss19.b3;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập b: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("phép cộng: " + MathOperations.add(a, b));
        System.out.println("phép trừ: " + MathOperations.subtract(a, b));
        System.out.println("phép nhân: " + MathOperations.multiply(a, b));
        System.out.println("phép chia: " + MathOperations.divide(a, b));
    }
}
