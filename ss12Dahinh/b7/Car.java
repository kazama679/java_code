package ss12Dahinh.b7;

public class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Xe di chuyển nhanh");
    }
    @Override
    public void sound() {
        System.out.println("Vroom");
    }
}
