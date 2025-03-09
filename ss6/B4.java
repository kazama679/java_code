package ss6;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập: ");
        String a = sc.nextLine();
        System.out.println(a.replaceAll("[0-9]", "*"));
    }
}
