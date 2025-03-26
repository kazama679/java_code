package ss19.b6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B6 {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h");
        IStringProcessor processor = s -> s.toUpperCase() + " - TECHNICAL";
        List<String> arrProcessor = new ArrayList<>();
        for (String s : arr) {
            arrProcessor.add(processor.processString(s));
        }
        processor.printList(arrProcessor);
    }
}
