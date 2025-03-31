package ss21;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhập vào n1 nguyên: ");
            int n1 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào n2 nguyên: ");
            int n2 = Integer.parseInt(sc.nextLine());
            System.out.println("Kết quả: "+(n1/n2));
        }catch(ArithmeticException e){
            System.out.println("lỗi chia cho 0");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
