package ss12Dahinh.b7;

public class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Xe đạp di chuyển chậm");
    }
    @Override
    public void sound() {
        System.out.println("Ring Ring");
    }
}