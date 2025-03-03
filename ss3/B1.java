package ss3;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println("Số không phải chẵn cũng không phải lẻ");
        } else if(n%2==0){
            System.out.println("Số " +n+ " là số chẵn");
        }else{
            System.out.println("Số " +n+ " là số le");
        }
    }
}