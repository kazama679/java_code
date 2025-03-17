package ss11TruuTuong.B4;

public class Test {
    public static void main(String[] args) {
        Electronic[] devices = {new TV(), new Radio()};
        for (Electronic device : devices) {
            device.turnOn();
            device.turnOff();
        }
    }
}
