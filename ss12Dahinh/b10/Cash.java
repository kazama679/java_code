package ss12Dahinh.b10;

public class Cash extends PaymentMethod {
    public Cash(double amount) {
        super(amount);
    }
    @Override
    public double calculateFee() {
        return 0;
    }
    @Override
    public double processPayment() {
        return amount;
    }
}