package ss23.thread;

public class LifecycleDemo {
    public static void main(String[] args) {
        ThreadLifecycle thread = new ThreadLifecycle();
        System.out.println("Trạng thái của thread lhi khởi tạo: " + thread.getState());
        thread.setName("ThreadLifecycle");
        thread.start();
        System.out.println("Trạng thái của thread sau khi gọi start: " + thread.getState());
        try {
            Thread.sleep(1000);
            System.out.println("Trạng thái của thread sau khi ngủ: " + thread.getState());
            thread.join();
            System.out.println("Trạng thái của thread sau khi hoàn thành: " + thread.getState());
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
