package ss11TruuTuong.B8;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> cars;

    public Garage() {
        cars = new ArrayList<>();
    }
    public void addCar(Car car) {
        cars.add(car);
    }
    public void startAllCars() {
        for (Car car : cars) {
            car.start();
        }
    }
    public void stopAllCars() {
        for (Car car : cars) {
            car.stop();
        }
    }
    public void refuelAllCars() {
        for (Car car : cars) {
            if (car instanceof Refuelable) {
                ((Refuelable) car).refuel();
            }
        }
    }
}
