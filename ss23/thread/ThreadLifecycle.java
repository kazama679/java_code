package ss23.thread;

public class ThreadLifecycle extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" đang chạy");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println(Thread.);
    }
}
