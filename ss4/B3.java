package ss4;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n la so nguyen duong: ");
        int n = sc.nextInt();
        if(n<1){
            System.out.println("so nhap vao k hop le");
        }else{
            for(int i=1;i<=10;i++){
                System.out.println(n+" * "+i+" = "+n*i);
            }
        }
    }
}