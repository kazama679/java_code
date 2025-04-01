package ss23.b5;

public class Writer extends Thread{
    private SharedData sharedData;
    public Writer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        String[] messages = { "tạch", "tạch", "tạch" };
        for (String msg : messages) {
            sharedData.writeMessage(msg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
