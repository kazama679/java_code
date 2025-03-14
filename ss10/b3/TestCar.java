package ss10.b3;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Ford");
        car.setYear(2017);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        car.setYear(2026);
        System.out.println(car.getYear());
    }
}
