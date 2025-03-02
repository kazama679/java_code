package ss2;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien: ");
        String ten = sc.nextLine();
        System.out.print("Nhap diem mon hoc 1: ");
        float mon1 = sc.nextFloat();
        System.out.print("Nhap diem mon hoc 2: ");
        float mon2 = sc.nextFloat();
        System.out.print("Nhap diem mon hoc 3: ");
        float mon3 = sc.nextFloat();

        float all = (mon1+mon2+mon3)/3;

        System.out.println("Ten sinh vien : "+ten);
        System.out.println("Diem mon 1 : "+mon1+ "| Diem mon 2 : "+mon2+ "| Diem mon 3 : "+mon3);
        System.out.println("Diem trung binh : "+all);
        System.out.println((all>5) ? "Danh gia : Len lop" : "Danh gia : Hoc lai");
    }
}
