package ss12Dahinh.b9;

public // Lớp trừu tượng Vehicle
abstract class Vehicle {
    protected String name;
    protected int speed;
    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public abstract void move();
    public abstract void sound();

    public void move(int time) {
        System.out.println(name + " chạy " + (speed * time) + " km " + time + " h");
    }
}