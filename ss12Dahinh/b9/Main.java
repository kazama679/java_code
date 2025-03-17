package ss12Dahinh.b9;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("ô tô", 100);
        Bike bike = new Bike("xe đạp", 20);
        Bus bus = new Bus("xe Bus", 50, 30);
        Airplane airplane = new Airplane("máy bay", 1000, 10000);

        Vehicle[] vehicles = {car, bike, bus, airplane};
        for (Vehicle v : vehicles) {
            v.move();
            v.sound();
            System.out.println();
        }
        int time = 1;
        System.out.println("di chuyển trong " + time + " h:");
        for (Vehicle v : vehicles) {
            v.move(time);
        }

        System.out.println();
        bus.showSeats();
        airplane.showAltitude();
    }
}