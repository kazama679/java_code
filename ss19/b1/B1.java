package ss19.b1;

import java.util.Arrays;
import java.util.List;

public class B1 {
    public static void main(String[] args) {
        Predicate<String> checkNull = s -> s == null || s.isEmpty();
        List<String> listString = Arrays.asList("A", "B", "", "C");
        listString.forEach(str -> {
            if (!checkNull.test(str)) {
                System.out.println(str);
            }
        });
    }
}
