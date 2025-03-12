package ss9.b4;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        double radius = sc.nextDouble();
        Circle circle1 = new Circle();
        circle1.display();
        Circle circle2 = new Circle(radius);
        circle2.getArea();
        circle2.getCircumference();
        circle2.display();
    }
}
