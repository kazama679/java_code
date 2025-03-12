package ss9.b3;

public class Rectangle {
    private double width;
    private double length;
    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }
    public void display(){
        System.out.println("width: " + width);
        System.out.println("lenght: " + length);
        System.out.println("diện tích: " + getArea());
        System.out.println("chu vi: " + getPerimeter());
    }
}
