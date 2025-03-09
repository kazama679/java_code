package ss6;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kỳ: ");
        String str = sc.nextLine().trim();
        String[] words = str.split("\\s+");
        int count = 0;
        String check = ".*[^a-zA-Z0-9].*";
        System.out.println("Các từ chứa ký tự đặc biệt:");
        for (String word : words) {
            if (word.matches(check)) {
                count++;
            }
        }
        System.out.print("Số lượng từ chứa ký tự đặc biệt: " + count+ " ");
        for (String word : words) {
            if (word.matches(check)) {
                System.out.print(word+" ");
            }
        }
    }
}
