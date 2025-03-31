package ss21.b5;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập n số ngto: ");
            int n = Integer.parseInt(sc.nextLine());
            if(checkNumber(n)){
                System.out.println("là số ngto");
            }else{
                System.out.println("k p số ngto");
            }
        }catch(NumberFormatException e){
            System.out.println("Lỗi: Bạn phải nhập số nguyên!");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static boolean checkNumber(int n) throws CheckN {
        if(n<=0){
            throw new CheckN("Phải dương");
        }
        if (n < 2) {
            return false;
        }
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
