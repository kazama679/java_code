package ss12Dahinh.b9;

public class Bus extends Vehicle {
    private int seats;
    public Bus(String name, int speed, int seats) {
        super(name, speed);
        this.seats = seats;
    }

    @Override
    public void move() {
        System.out.println(name + " đang di chuyển với tốc độ vừa");
    }
    @Override
    public void sound() {
        System.out.println(name + " Honk");
    }
    public void showSeats() {
        System.out.println(name + " có " + seats + " ghế");
    }
}