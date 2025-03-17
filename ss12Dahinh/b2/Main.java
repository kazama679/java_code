package ss12Dahinh.b2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sumTwoNumbers = calculator.add(2, 3);
        System.out.println("Tổng 2 số: " + sumTwoNumbers);
        int sumThreeNumbers = calculator.add(1, 2, 3);
        System.out.println("Tổng 3 số: " + sumThreeNumbers);
    }
}
