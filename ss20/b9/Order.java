package ss20.b9;

import java.time.LocalDate;
import java.util.Optional;

public class Order {
    private int id;
    private String customerName;
    private LocalDate createdDate;
    private Optional<LocalDate> deliveryDate;

    public Order(int id, String customerName, LocalDate createdDate, LocalDate deliveryDate) {
        this.id = id;
        this.customerName = customerName;
        this.createdDate = createdDate;
        this.deliveryDate = Optional.ofNullable(deliveryDate); // Dùng Optional
    }

    public Order() {
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Optional<LocalDate> getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = Optional.ofNullable(deliveryDate);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void toDisplayString(){
        System.out.println("Mã đơn hàng: " + id);
        System.out.println("Tên khách hàng: " + customerName);
        System.out.println("Ngày đặt hàng: " + createdDate);
        System.out.println("Ngày giao hàng: " + deliveryDate.map(LocalDate::toString).orElse("Chưa giao"));
    }
}
