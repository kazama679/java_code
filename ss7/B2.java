package ss7;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hello, java World");
        System.out.println("Chuỗi ban đầu: "+builder);

        builder.delete(5, 9);
        System.out.println("Chuỗi sau xóa: "+builder);

        builder.replace(8, 13, "Universe");
        System.out.println("Chuỗi sau xóa: "+builder);
    }
}
