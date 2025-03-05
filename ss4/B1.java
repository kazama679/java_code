package ss4;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println("tong cac so tu 1 den "+n+" = "+sum);
    }
}