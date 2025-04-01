package ss23.b4;

public class B4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        MyThread thread2 = new MyThread("Thread 2 bắt đầu...");
        MyThread thread3 = new MyThread("Thread 3 bắt đầu...");
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
        thread3.start();
    }
}
