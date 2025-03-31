package ss21.b3;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) throws CheckAge {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp vào độ tuổi: ");
        int n = Integer.parseInt(sc.nextLine());
        checkAge(n);
    }
    public static void checkAge(int age) throws CheckAge {
        if(age < 18) {
            throw new CheckAge("Bạn chưa đủ tuổi");
        }
        System.out.println("Chào mừng bạn");
    }
}
