package ss9.b3;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Nhập width: ");
        double width = scanner.nextDouble();
        System.out.println("Nhập length: ");
        double length = scanner.nextDouble();
        Rectangle rectangle2 = new Rectangle(width, length);
        rectangle2.getArea();
        rectangle2.getPerimeter();
        rectangle2.display();
    }
}
