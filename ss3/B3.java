package ss3;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=8.5&& x<=10){
            System.out.println("Xep loai : Gioi");
        }else if(x>=6.5 && x<=8.5){
            System.out.println("Xep loai : Kha");
        }else if(x>=5 && x<=6.5){
            System.out.println("Xep loai : Trung binh");
        }else if(x<=5&& x>=0){
            System.out.println("Xep loai : Yeu");
        }else{
            System.out.println("Diem khong hop le");
        }
    }
}
