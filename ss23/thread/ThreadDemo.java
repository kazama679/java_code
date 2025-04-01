package ss23.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.setName("Thread1");
        thread2.setName("Thread2");
        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(new MyRunable(), "Thread3");
        Thread thread4 = new Thread(new MyRunable(), "Thread4");
        thread3.start();
        thread4.start();
    }
}
