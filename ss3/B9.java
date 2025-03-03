package ss3;

import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một số từ 100 đến 999: ");
        int number = sc.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("Số nhập vào không hợp lệ.");
        } else {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int units = number % 10;
            System.out.println("Số " + number + " được đọc là: " + convertToWords(hundreds, tens, units));
        }
        sc.close();
    }

    public static String convertToWords(int hundreds, int tens, int units) {
        String[] numberWords = { "", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
        String result = "";
        result += numberWords[hundreds] + " trăm";
        if (tens == 0 && units == 0) {
            return result.trim();
        } else if (tens == 0) {
            result += " lẻ";
        } else if (tens == 1) {
            result += " mười";
        } else {
            result += " " + numberWords[tens] + " mươi";
        }
        if (units == 1 && tens > 1) {
            result += " mốt";
        } else if (units == 5 && tens > 0) {
            result += " lăm";
        } else if (units != 0) {
            result += " " + numberWords[units];
        }
        return result.trim();
    }
}