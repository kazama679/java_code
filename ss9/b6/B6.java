package ss9.b6;

public class B6 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1, 2);
        Point2D p2 = new Point2D(3, 4);
        System.out.println("Tọa độ ban đầu:");
        p1.displayPoint();
        p2.displayPoint();

        double distance = p1.distanceTo(p2);
        System.out.println("Khoảng cách giữa p1 và p2: " + distance);
        p1.setX(5);
        p1.setY(6);
        System.out.println("Tọa độ sau khi cập nhật:");
        p1.displayPoint();
    }
}
