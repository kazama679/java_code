package ss11TruuTuong.B5;

public class Square implements Colorable {
    private double side;
    private String color;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("hình vuông có màu: " + color);
    }
}
