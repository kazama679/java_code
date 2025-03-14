package ss10.b10;

public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Circle("hình tròn", 1);
        Shape shape2 = new Triangle("hình tam giác", 2, 3, 4);
        Shape shape3 = new Rectangle("hcn", 5, 6);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
        System.out.println(shape3.toString());
    }
}
