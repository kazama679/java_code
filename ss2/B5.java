package ss2;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float area = x*y;
        float circumference = (x+y)*2;
        System.out.println("Dien tich : "+area);
        System.out.println("Chu vi : "+circumference);
    }
}
