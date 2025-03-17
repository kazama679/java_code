package ss12Dahinh.b9;

public class Bike extends Vehicle {
    public Bike(String name, int speed) {
        super(name, speed);
    }
    @Override
    public void move() {
        System.out.println(name + " đang di chuyển chậm");
    }
    @Override
    public void sound() {
        System.out.println(name + " Ring Ring");
    }
}