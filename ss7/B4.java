package ss7;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(sc.nextLine());
        sb.reverse();
        String a = sb.toString();
        String b = sb.reverse().toString();
        if(a.equalsIgnoreCase(b)){
            System.out.println("Chuỗi đối xứng");
        }else{
            System.out.println("Chuỗi k đối xứng");
        }
    }
}