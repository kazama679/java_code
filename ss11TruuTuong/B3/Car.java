package ss11TruuTuong.B3;

public class Car extends Vehicle {
    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Name: " + name + ", Speed: " + speed + " km/h");
    }
}
