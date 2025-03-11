package ss7;

import java.util.Scanner;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < a.length(); i++) {
            if (i+1 <a.length() && a.charAt(i) == a.charAt(i+1)) {
                count++;
            } else {
                sb.append(a.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(sb);
    }
}