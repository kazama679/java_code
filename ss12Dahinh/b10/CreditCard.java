package ss12Dahinh.b10;

public class CreditCard extends PaymentMethod {
    public CreditCard(double amount) {
        super(amount);
    }
    @Override
    public double calculateFee() {
        return amount * 0.02;
    }
    @Override
    public double processPayment() {
        return amount + calculateFee();
    }
}