package ss23.b2;

public class B2 {
    public static void main(String[] args) {
        Thread thread2 = new Thread(new B2Thread(), "Thread2");
        thread2.start();
    }
}
