package ss23.thread;

// kế thừa lớp Thread của javaa
public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}
