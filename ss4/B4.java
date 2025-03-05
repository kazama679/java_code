package ss4;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        while(n!=0){
            System.out.println("Nhap n: ");
            n = sc.nextInt();
            sum+= n;
        }
        System.out.println("Tong cac so da nhap: "+sum);
    }
}