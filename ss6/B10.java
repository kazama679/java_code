package ss6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập: ");
        String str = sc.nextLine();Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        System.out.print("Các số trong chuỗi: ");
        boolean found = false;
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            found = true;
        }
        if (!found) {
            System.out.print("[]");
        }

        str = str.replaceAll("\\s+", " ").replaceAll("[^a-zA-Z0-9\\s]", "").trim().toLowerCase();
        if (str.isEmpty()) {
            System.out.println("Không có văn bản để xử lý");
            return;
        }
        System.out.println("\nchuỗi sau khi chuẩn hóa: "+str);
    }
}
