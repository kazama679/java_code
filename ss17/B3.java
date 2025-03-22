package ss17;

import java.util.HashSet;
import java.util.Set;

public class B3 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        numbers.removeIf(number -> number % 2 == 0);

        System.out.println("HashSet sau khi xóa các số chẵn: " + numbers);
    }
}
