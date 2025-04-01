package ss23.thread;

public class SumCalculator implements Runnable {
    private long start;
    private long end;
    private long sumNumber;

    public SumCalculator(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (long i = start; i <= end; i++) {
            sumNumber += i;
        }
    }

    public long getSumNumber() {
        return sumNumber;
    }
}
