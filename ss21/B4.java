package ss21;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập n kiểu số nguyên: ");
            int n = Integer.parseInt(sc.nextLine());
            System.out.println("Số bạn đã nhập: "+n);
        }catch(NumberFormatException e){
            System.out.println("Lỗi: Bạn phải nhập số nguyên!");
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
        }
    }
}
