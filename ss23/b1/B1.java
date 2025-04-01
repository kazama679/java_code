package ss23.b1;

public class B1 {
    public static void main(String[] args) {
        Thread thread = new B1Thread();
        thread.setName("B1 Thread");
        thread.start();
    }
}
