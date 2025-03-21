package ss16;

import java.util.ArrayList;
import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các số nguyên: ");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        ArrayList<Integer> primes = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();

        for (int num : numbers) {
            if (isPrime(num)) {
                primes.add(num);
            } else if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }

        System.out.println("Số nguyên tố: " + primes);
        System.out.println("Số chẵn (không phải nguyên tố): " + evens);
        System.out.println("Số lẻ (không phải nguyên tố): " + odds);
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
