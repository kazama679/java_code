package ss20.b9;

import java.time.LocalDate;
import java.util.List;

public class B9 {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "Quý", LocalDate.of(2025, 3, 20), LocalDate.of(2025, 3, 25)),
                new Order(2, "Lan", LocalDate.of(2025, 3, 21), null),
                new Order(3, "Minh", LocalDate.of(2025, 3, 22), LocalDate.of(2025, 3, 23)),
                new Order(4, "Huyền", LocalDate.of(2025, 3, 23), null),
                new Order(5, "Việt", LocalDate.of(2025, 3, 23), LocalDate.of(2025, 3, 30))
        );
        System.out.println("Liệt kê các đơn hàng đã được giao: ");
        orders.stream().filter(order->order.getDeliveryDate().isPresent()).forEach(Order::toDisplayString);

        System.out.println("\nLiệt kê các đơn hàng đã chưa được giao: ");
        orders.stream().filter(order->order.getDeliveryDate().isEmpty()).forEach(Order::toDisplayString);

        System.out.println("\nĐếm số đơn hàng đã giao trong khoảng từ ngày 2025-03-17 đến 2025-03-23: " +orders.stream().filter(order->order.getDeliveryDate()
                        .filter(date->date.isAfter(LocalDate.of(2025,3,17)) && date.isBefore(LocalDate.of(2025,3,24))).isPresent()).count());

        System.out.println("\nIn thông tin từng đơn: ");
        orders.forEach(Order::toDisplayString);
    }
}