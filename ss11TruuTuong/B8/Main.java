package ss11TruuTuong.B8;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car vinfast= new ElectricCar("vf8", 2023, 20000);
        Car benz = new GasCar("mercedes benz", 2022, 55000);
        garage.addCar(benz);
        garage.addCar(vinfast);
        garage.startAllCars();
        garage.stopAllCars();
        garage.refuelAllCars();
    }
}