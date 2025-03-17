package ss12Dahinh.b4;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(1);
        Shape rectangle = new Rectangle(2, 3);
        System.out.println("Diện tích hình tròn: " + circle.area());
        System.out.println("Diện tích hcn: " + rectangle.area());
        Shape shape = new Shape();
        System.out.println("Diện tích hình tròn: " + shape.area(3));
        System.out.println("Diện tích hcn: " + shape.area(4, 5));
    }
}
