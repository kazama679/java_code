package ss2;
import java.util.*;
import java.math.BigInteger;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a lớn: ");
        BigInteger a = new BigInteger(sc.nextLine());

        System.out.print("Nhập b lớn: ");
        BigInteger b = new BigInteger(sc.nextLine());

        System.out.println("Tổng: " + a.add(b));
        System.out.println("Hiệu: " + a.subtract(b));
        System.out.println("Tích: " + a.multiply(b));
        if (!b.equals(BigInteger.ZERO)) {
            System.out.println("Thương: " + a.divide(b));
            System.out.println("Modulo: " + a.mod(b));
        } else {
            System.out.println("Không thể chia hoặc lấy dư cho 0.");
        }

        System.out.println("Lũy thừa (số thứ nhất mũ số thứ hai): " + a.pow(b.intValue()));
        sc.close();
    }
}