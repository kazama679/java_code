package ss9.b9;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Mẫu số không thể bằng 0!");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Tìm ước chung để rút gọn
    private int gcd(int a, int b) {
        if (b==0){
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }
    public void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số bằng 0!");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}