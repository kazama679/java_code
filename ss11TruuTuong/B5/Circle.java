package ss11TruuTuong.B5;

public class Circle implements Colorable {
    private double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Hình tròn có màu: " + color);
    }
}
