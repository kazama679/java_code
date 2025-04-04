package ss25.b3;

public class B3 {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder().setEngine("VF9").setSeats(4).setColor("Black").build();
        Car car2 = new Car.CarBuilder().setEngine("VF8").setSeats(3).setColor("White").build();
        System.out.println("Thông tin xe 1:");
        car1.displayInfo();
        System.out.println("Thông tin xe 2:");
        car2.displayInfo();
    }
}
