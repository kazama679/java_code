package ss7;

import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        if (a.isEmpty()) {
            System.out.println("");
            return;
        }
        char[] b = a.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(b[0]));
        for (int i = 1; i < b.length; i++) {
            if(Character.isLowerCase(b[i])){
                sb.append(b[i]);
            }else if(Character.isUpperCase(b[i])){
                sb.append("_"+Character.toLowerCase(b[i]));
            }else if(b[i] == '_'){
                sb.append("_");
            }
        }
        System.out.println(sb);
    }
}