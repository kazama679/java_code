package ss21;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {1,2,34,5,6,7,8};
        try{
            System.out.println("Nhập chỉ số của mảng: ");
            int n = Integer.parseInt(sc.nextLine());
            System.out.println("Giá trị: "+arr[n]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Lỗi tràn chỉ số của mảng");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
