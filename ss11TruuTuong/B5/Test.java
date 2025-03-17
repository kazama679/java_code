package ss11TruuTuong.B5;

public class Test {
    public static void main(String[] args) {
        Colorable[] shapes = {
                new Circle(2),
                new Rectangle(3, 4),
                new Square(5)
        };
        shapes[0].setColor("Đen");
        shapes[1].setColor("Đỏ");
        shapes[2].setColor("Trắng");
    }
}
