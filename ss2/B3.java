package ss2;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("x == y : "+(a==b));
        System.out.println("x != y : "+(a!=b));
        System.out.println("x > y : "+(a>b));
        System.out.println("x < y : "+(a<b));
        System.out.println("x >= y : "+(a>=b));
        System.out.println("x <= y : "+(a<=b));
    }
}