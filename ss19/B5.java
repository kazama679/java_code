package ss19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng chuỗi: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập chuỗi "+(i+1)+": ");
            arr[i] = sc.nextLine();
        }
        int count = 0;
        Pattern pattern = Pattern.compile("^A");
        for (int i = 0; i < n; i++) {
            if(pattern.matcher(arr[i]).find()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
