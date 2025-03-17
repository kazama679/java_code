package ss11TruuTuong.B5;

public class Rectangle implements Colorable{
    private double length, width;
    private String color;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Hcn có màu: " + color);
    }
}
