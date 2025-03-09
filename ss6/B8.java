package ss6;

import java.util.Scanner;
import java.util.regex.Pattern;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số điện thoại: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập số đt thứ %d: ", i + 1);
            str[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            str[i] = str[i].replaceAll("[-.\\s]+", "").trim();
            if (Pattern.matches("^0\\d{9}$", str[i])) {
                str[i] = "+84" + str[i].substring(1);
            }
            if (Pattern.matches("^\\+84\\d{9}$", str[i])) {
                str[i] = str[i].substring(0, 3) + " " + str[i].substring(3, 6) + " " + str[i].substring(6, 9) + " " + str[i].substring(9);
            } else {
                str[i] = "Số điện thoại không hợp lệ";
            }
        }
        System.out.println("Các số sau khi kiểm tra:");
        for (String s : str) {
            System.out.println(s);
        }
    }
}
