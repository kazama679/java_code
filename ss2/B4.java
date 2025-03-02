package ss2;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean a= sc.nextBoolean();
        Boolean b = sc.nextBoolean();
        Boolean c = sc.nextBoolean();

        Boolean condition1 = a && b;
        Boolean condition2 = a || b;
        Boolean condition3 = c;

        System.out.println(condition1 ? "Cả hai giá trị a và b đều đúng" : "Hoặc a sai hoặc b sai");
        System.out.println(condition2 ? "Trong a và b có ít nhất 1 giá trị đúng" : "Cả 2 giá trị a và b đều sai");
        System.out.println(condition3 ? "Phủ định của c là đúng" : "Phủ định của c là sai");
    }
}