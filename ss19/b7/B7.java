package ss19.b7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B7 {
    public static void main(String[] args) {
        ListProcessorImpl listProcessor = new ListProcessorImpl();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(listProcessor.containsNegative(list) ? "Danh sách chứa số âm" : "Danh sách k chứa số âm");
    }
}
