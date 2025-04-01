package ss23.b5;

public class B5 {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Writer writer = new Writer(sharedData);
        Reader reader = new Reader(sharedData);
        writer.start();
        reader.start();
    }
}
