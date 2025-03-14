package ss10.b6;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(1);
        point.setY(2);
        System.out.println("Điểm ban đầu: " + point);

        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setX(1);
        moveablePoint.setY(2);
        moveablePoint.setxSpeed(1);
        moveablePoint.setySpeed(1);
        System.out.println("Trước khi di chuyển: " + moveablePoint);

        moveablePoint.move();
        System.out.println("Sau khi di chuyển: " + moveablePoint);

        moveablePoint.setxSpeed(2);
        moveablePoint.setySpeed(2);
        moveablePoint.move();
        System.out.println("Sau khi thay đổi tốc độ: " + moveablePoint);
    }
}
