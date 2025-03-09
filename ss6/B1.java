package ss6;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kỳ: ");
        String str = sc.nextLine().trim();
        if (str.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] words = str.split("\\s+");
        int count=0;
        for (String word : words) {
            count++;
        }
        System.out.println(count);
    }
}
