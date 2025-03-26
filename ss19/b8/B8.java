package ss19.b8;

import java.util.Arrays;
import java.util.List;

public class B8 {
    public static void main(String[] args) {
        ListProcessorImpl listProcessor = new ListProcessorImpl();
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("Tổng các số lẻ: " + listProcessor.sumOddNumbers(list));
        System.out.print("Các phần tử lẻ: ");
        listProcessor.checkOdd(list);
    }
}
