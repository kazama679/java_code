package ss18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "I");
        numbers.put(2, "II");
        numbers.put(3, "III");
        numbers.put(4, "IV");
        numbers.put(5, "V");
        numbers.put(6, "VI");
        numbers.put(7, "VII");
        numbers.put(8, "VIII");
        numbers.put(9, "IX");
        numbers.put(10, "X");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n từ 1-10");
        int n = Integer.parseInt(scanner.nextLine());
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            if(n == entry.getKey()) {
                System.out.println(entry.getValue());
            }
        }
    }
}