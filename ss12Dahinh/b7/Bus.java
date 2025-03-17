package ss12Dahinh.b7;

public class Bus extends Vehicle {
    @Override
    public void move() {
        System.out.println("Xe buýt di chuyển với tốc độ trung bình");
    }
    @Override
    public void sound() {
        System.out.println("Honk Honk");
    }
}
