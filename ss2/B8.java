package ss2;

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sinh vien: ");
        String idStudent = sc.nextLine();

        System.out.print("Nhap ten sinh vien: ");
        String nameStudent = sc.nextLine();

        System.out.print("Nhap sdt sinh vien: ");
        String phoneStudent = sc.nextLine();

        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        String date = sc.nextLine();

        System.out.print("Nhap gioi tinh sinh vien (1: Nam, 0: Nu): ");
        int gender = sc.nextInt();

        System.out.println("\n-----Thong tin sinh vien-----");
        System.out.println("Ma sinh vien: " + idStudent);
        System.out.println("Ten sinh vien: " + nameStudent);
        System.out.println("So dien thoai: " + phoneStudent);
        System.out.println("Ngay sinh: " + date);
        System.out.println("Gioi tinh: " + (gender == 1 ? "Nam" : "Nu"));

        sc.close();
    }
}