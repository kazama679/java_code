package ss9.b9;

public class B9 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(5, 6);
        System.out.println("Phân số 1: " + f1);
        System.out.println("Phân số 2: " + f2);

        Fraction sum = f1.add(f2);
        System.out.println("Tổng: " + sum);

        Fraction difference = f1.subtract(f2);
        System.out.println("Hiệu: " + difference);

        Fraction product = f1.multiply(f2);
        System.out.println("Tích: " + product);

        Fraction quotient = f1.divide(f2);
        System.out.println("Thương: " + quotient);
    }
}
