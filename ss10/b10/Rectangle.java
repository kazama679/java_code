package ss10.b10;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(String name,double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    @Override
    public String toString() {
        return super.toString() + ", Chiều rộng: " + width + ", Chiều cao: " + height;
    }
}
