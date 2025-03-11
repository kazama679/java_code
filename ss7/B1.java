package ss7;

import java.util.Locale;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();

        StringBuffer sb = new StringBuffer();
        sb.append(a).append(b).append(c);
        String newStr = sb.toString().toUpperCase();
        System.out.println(newStr);
    }
}
