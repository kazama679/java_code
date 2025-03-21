package ss16;

import java.util.ArrayList;

public class B4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Danh sách số nguyên: " + numbers);
        System.out.println("Tổng của tất cả phần tử: " + sum);
    }
}
