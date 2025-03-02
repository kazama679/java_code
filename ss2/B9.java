package ss2;

import java.util.Scanner;
import java.math.*;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float p = (a+b+c)/2;
        float chuVi = p*2;
        double heron = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Chu vi tam giac: " + chuVi);
        System.out.println("Dien tich tam giac: " + heron);
    }
}
