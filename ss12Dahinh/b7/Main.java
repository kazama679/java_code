package ss12Dahinh.b7;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new Bus();
        for (Vehicle v : vehicles) {
            v.move();
            v.sound();
            System.out.println();
        }
    }
}