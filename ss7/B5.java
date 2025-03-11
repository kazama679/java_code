package ss7;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        String[] b = a.split("\\s");
        StringBuffer sb1 = new StringBuffer();
        for (int i = b.length-1; i >=0 ; i--) {
            sb1.append(b[i]+" ");
        }
        System.out.println(sb1);
    }
}