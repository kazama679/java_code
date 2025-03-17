package ss12Dahinh.b10;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard(1000.0);
        PaymentMethod debitCard = new DebitCard(1000.0);
        PaymentMethod cash = new Cash(1000.0);
        System.out.println("--- Credit Card ---");
        System.out.println("Tổng thanh toán: " + creditCard.processPayment());
        System.out.println("Đã xử lý " + creditCard.processPayment("USD") + "\n");

        System.out.println("--- Debit Card ---");
        System.out.println("Tổng thanh toán: " + debitCard.processPayment());
        System.out.println("Đã xử lý " + debitCard.processPayment("EUR") + "\n");

        System.out.println("--- Cash ---");
        System.out.println("Tổng thanh toán: " + cash.processPayment());
        System.out.println("Đã xử lý " + cash.processPayment("JPY") + "\n");
    }
}