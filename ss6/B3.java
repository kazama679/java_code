package ss6;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi văn bản: ");
        String a = sc.nextLine();
        System.out.println("chuỗi cần tìm: ");
        String b = sc.nextLine();

        int index = a.indexOf(b);
        if(index==-1){
            System.out.printf("K tìm thấy %s trong chuỗi", b);
            return;
        }
        System.out.printf("từ %s xuất hiện tại vị trí %d trong chuỗi", b, index);
    }
}