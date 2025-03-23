package ss17;

import java.util.Scanner;
import java.util.*;

public class B8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tổng k cần tìm: ");
        int k = scanner.nextInt();

        Set<String> set = new HashSet<>();
        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    set.add(Math.min(arr[i], arr[j]) + " " + Math.max(arr[i], arr[j]));
                }
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println("Các cặp số có tổng bằng " + k + ": " + list);
    }
}
