package ss23.thread;

public class MyRunable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}
