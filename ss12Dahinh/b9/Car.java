package ss12Dahinh.b9;

public class Car extends Vehicle {
    public Car(String name, int speed) {
        super(name, speed);
    }
    @Override
    public void move() {
        System.out.println(name + " đang di chuyển nhanh");
    }
    @Override
    public void sound() {
        System.out.println(name + " Vroom");
    }
}