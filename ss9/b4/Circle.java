package ss9.b4;

public class Circle {
    private double radius;
    public Circle () {
        this.radius = 1.0;
    }
    public Circle (double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getCircumference(){
        return this.radius * 2 * Math.PI;
    }
    public void display(){
        System.out.println("Bán kính: " + this.radius);
        System.out.println("diện tích: " + this.getArea());
        System.out.println("chu vi: " + this.getCircumference());
    }
}
