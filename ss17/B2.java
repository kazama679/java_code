package ss17;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B2 {
    public static void main(String[] args) {
        Set<String> setHashSet = new HashSet<>();
        setHashSet.add("Java");
        setHashSet.add("C++");
        setHashSet.add("Python");
        setHashSet.add("HTML");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chuỗi để check: ");
        String check = sc.nextLine();
        System.out.println(setHashSet.contains(check));
    }
}
