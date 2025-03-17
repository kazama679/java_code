package ss11TruuTuong.B3;

public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 200);
        Vehicle bike = new Bike("Yamaha", 100);
        car.start();
        car.displayInfo();
        bike.start();
        bike.displayInfo();
    }
}
