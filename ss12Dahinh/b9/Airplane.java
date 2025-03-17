package ss12Dahinh.b9;

public class Airplane extends Vehicle {
    private int altitude;
    public Airplane(String name, int speed, int altitude) {
        super(name, speed);
        this.altitude = altitude;
    }

    @Override
    public void move() {
        System.out.println(name + " đang bay");
    }
    @Override
    public void sound() {
        System.out.println(name + " Whoosh");
    }
    public void showAltitude() {
        System.out.println(name + " đang bay ở độ cao " + altitude + " m.");
    }
}