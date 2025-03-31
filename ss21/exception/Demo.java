package ss21.exception;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập vào sô nguyên thứ 1: ");
            int firstNumber = Integer.parseInt(sc.nextLine());
            System.out.println("nhập vào số nguuyeen thứ 2:");
            int secondNumber = Integer.parseInt(sc.nextLine());
            int divNumbers = firstNumber / secondNumber;
            System.out.println("kết quả phép chia: " + divNumbers);
        }catch(ArithmeticException e1){
            // xử lý lỗi chia cho 0
            System.out.println("K thể chia cho 0");
        }catch(NumberFormatException e2){
            //xử lý lỗi khi k thể cast từ String về int
            System.out.println(e2.getMessage());
        }catch(Exception ex){
            ex.printStackTrace();
        }

        try {
            int[] numbers={1,3,5,7,9};
            System.out.println("Nhập vào chỉ số phần tử cần lấy giá trị: ");
            int index = Integer.parseInt(sc.nextLine());
            System.out.println("Giá trị phần tử là: "+numbers[index]);
            System.out.println("KẾT THÚC BÌNH THƯỜNG");
        }catch(ArrayIndexOutOfBoundsException | NumberFormatException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            // chắc chắn chạy vào đây
            System.out.println("Kết thúc quá trình xử lý với mảng");
        }
    }
}
