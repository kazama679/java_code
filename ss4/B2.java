package ss4;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = true;
        if(n<2){
            System.out.println("n k p so nguyen to");
        }else{
            for (int i = 2;i*i <= n; i++) {
                if(n%i==0){
                    check = false;
                }
            }
            if(!check){
                System.out.println("n k p so nguyen to");
            }else{
                System.out.println("n la so nguyen to");
            }
        }
        sc.close();
    }
}
