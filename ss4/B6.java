package ss4;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = Math.abs(n);
        int sum = 0;
        while (m>0) {
            sum+=m%10;
            m/=10;
        }
        System.out.println("tổng các chữ số là: "+sum);
    }
}
