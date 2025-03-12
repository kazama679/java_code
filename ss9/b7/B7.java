package ss9.b7;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation pt = new QuadraticEquation(a, b, c);
        pt.display();
    }
}
