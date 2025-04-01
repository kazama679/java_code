package ss23.thread;

public class MuntiThreadDemo {
    public static void main(String[] args) {
        // Tính tổng các số từ 1 đến 1.000.000.000
        long max = 10;
        System.out.println("Không sử dụng đa luồng");

        long sum = 0;
        long startTime = System.currentTimeMillis();
        for (long i = 0; i <= max; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Tổng các số: " + sum);
        System.out.println("Thời gian thực hiện khi không dùng đa luồng: " + (endTime - startTime) + " milliseconds");

        System.out.println("Sử dụng đa luồng:");
        int sizeOfThread = 3;
        long numberOfThreads = max / sizeOfThread;
        Thread[] threads = new Thread[sizeOfThread];
        SumCalculator[] calculators = new SumCalculator[sizeOfThread];

        long start = System.currentTimeMillis();
        for (int i = 0; i < sizeOfThread; i++) {
            long startRange = i * numberOfThreads + 1;
            long endRange = (i == sizeOfThread - 1) ? max : (i + 1) * numberOfThreads;

            calculators[i] = new SumCalculator(startRange, endRange);
            threads[i] = new Thread(calculators[i]);
            threads[i].start();
        }

        long sumNumbers = 0;
        for (int i = 0; i < sizeOfThread; i++) {
            try {
                threads[i].join();
                sumNumbers += calculators[i].getSumNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        long end = System.currentTimeMillis();

        System.out.println("Tổng các số dùng đa luồng: " + sumNumbers);
        System.out.println("Thời gian thực hiện: " + (end - start) + " milliseconds");
    }
}