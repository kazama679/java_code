package ss16;

import java.util.ArrayList;
import java.util.Collections;

public class B3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Danh sách số nguyên: " + numbers);
        System.out.println("Phần tử lớn nhất: " + max);
        System.out.println("Phần tử nhỏ nhất: " + min);
    }
}
